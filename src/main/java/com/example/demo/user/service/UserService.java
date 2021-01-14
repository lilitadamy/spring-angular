package com.example.demo.user.service;

import com.example.demo.user.model.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto getUserById(int id);

    List<UserDto> getAll();

    UserDto addUser(UserDto userDto);

    String getAddressByUserId(int id);
}
