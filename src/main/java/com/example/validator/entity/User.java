package com.example.validator.entity;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -8987009748586768841L;

    @NotBlank(message = "用户名不能为空!")
    private String username;

    @NotBlank(message = "密码不能为空!")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
