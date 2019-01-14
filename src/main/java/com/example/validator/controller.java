package com.example.validator;

import com.example.validator.entity.User;
import com.example.validator.utils.ValidatorUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/test")
    public void test(User user){
        ValidatorUtil.validateEntity(user);
    }
}
