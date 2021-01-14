package com.example.demo.user.mapper;

import com.example.demo.user.model.dto.UserDto;
import com.example.demo.user.model.entity.UserEntity;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserMapper {
    ModelMapper modelMapper = new ModelMapper();

    public UserDto mapUserEntityToDto (UserEntity userEntity) {
        UserDto userDto = modelMapper.map(userEntity, UserDto.class);
        return userDto;
    }

    public UserEntity mapUserDtoToEntity (UserDto userDto) {
        UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
        return userEntity;
    }

    public List<UserDto> mapUserListEntityToDto (List<UserEntity> userEntities) {
        List<UserDto> userDtos = new ArrayList<>();
        for (UserEntity userEntity: userEntities) {
            userDtos.add(mapUserEntityToDto(userEntity));
        }
        return userDtos;
    }

    public UserDto mapUserOptionalEntityToDto(Optional<UserEntity> userEntity) {
        return modelMapper.map(userEntity, UserDto.class);
    }
}
