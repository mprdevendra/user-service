package com.iris.controller;

import com.iris.dto.UserDto;
import com.iris.service.UserService;
import com.iris.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/resister")
    public ResponseEntity<?> saveUser(@RequestBody UserDto userDto){
        UserVO user = userService.registerUser(userDto);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") Integer id,@RequestBody UserDto userDto){
        UserVO userVO = new UserVO();
        return new ResponseEntity<>(userVO, HttpStatus.CREATED);
    }

}
