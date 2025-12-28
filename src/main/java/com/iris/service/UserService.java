package com.iris.service;

import com.iris.dto.UserDto;
import com.iris.entity.User;
import com.iris.repository.UserRepository;
import com.iris.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserVO registerUser(UserDto userDto) {
        User userEntity = dtoToEntityMapper(userDto);
        User user = userRepository.save(userEntity);
        return entityToVoMapper(user);
    }

    private User dtoToEntityMapper(UserDto userDto) {
        User userEntity = new User();
        userEntity.setUserId(userDto.getUserId());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setCountryCode(userDto.getCountryCode());
        userEntity.setPhone(userDto.getPhone());
        userEntity.setDepartment(userDto.getDepartment());
        userEntity.setRole(userDto.getRole());
        return userEntity;
    }

    private UserVO entityToVoMapper(User user){
        UserVO userVO = new UserVO();
        userVO.setUserId(user.getUserId());
        userVO.setFirstName(user.getFirstName());
        userVO.setLastName(user.getLastName());
        userVO.setEmail(user.getEmail());
        userVO.setCountryCode(user.getCountryCode());
        userVO.setPhone(user.getPhone());
        userVO.setDepartment(user.getDepartment());
        userVO.setRole(user.getRole());
        return userVO;
    }
}
