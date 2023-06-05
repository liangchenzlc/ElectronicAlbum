package com.coderedma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String username;
    private String password;
    private String avatar;
    private Character sex;
    private String phone;
    private String idNumber;
    private String realName;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", realName='" + realName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
