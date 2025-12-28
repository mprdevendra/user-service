package com.iris.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String countryCode;
    private Integer phone;
    private String department;
    private String role;


}
