package com.example.validator.test;

import com.example.validator.entity.User;
import com.example.validator.utils.ValidatorUtil;

public class TestValidator {

    public static void main(String[] args){
        User user = new User();
        user.setUsername("张三");
        ValidatorUtil.validateEntity(user);
    }
}
