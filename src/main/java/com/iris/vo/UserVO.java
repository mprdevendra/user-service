package com.iris.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String countryCode;
    private Integer phone;
    private String department;
    private String role;
}
