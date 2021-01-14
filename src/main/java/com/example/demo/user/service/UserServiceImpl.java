package com.example.demo.user.service;

import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.model.dto.UserDto;
import com.example.demo.user.model.entity.UserEntity;
import com.example.demo.user.repository.UserDetailsRepository;
import com.example.demo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public UserDetailsRepository userDetailsRepository;

    UserMapper userMapper = new UserMapper();

    @Override
    public UserDto getUserById(int id) {
        return userMapper.mapUserOptionalEntityToDto(userRepository.findById(id));
    }

    @Override
    public List<UserDto> getAll() {
        return userMapper.mapUserListEntityToDto(userRepository.findAll());
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        try {
            UserEntity userEntity = userRepository.save(userMapper.mapUserDtoToEntity(userDto));
            return userMapper.mapUserEntityToDto(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getAddressByUserId(int id) {
        Optional<UserEntity> optionalUserEntity = userRepository.findById(id);
        UserEntity userEntity = optionalUserEntity.orElseThrow(() -> new RuntimeException("user not found"));

        return userEntity.getUserDetails().getAddress();
    }

}
