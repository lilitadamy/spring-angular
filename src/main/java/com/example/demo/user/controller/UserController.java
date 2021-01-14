package com.example.demo.user.controller;

import com.example.demo.user.model.dto.UserDto;
import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
       return ResponseEntity.ok(userService.addUser(userDto));
//        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable int id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping(value = "/get-all")
    public ResponseEntity<List<UserDto>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping(value = "/get-address-by-user-id/{id}")
    public ResponseEntity<String> getAddressByUserId(@PathVariable int id) {
        return ResponseEntity.ok(userService.getAddressByUserId(id));
    }

}
