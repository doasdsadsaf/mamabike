package com.coder520.mamabike.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mamabike
 * @description: UserController
 * @author: dongwei
 * @create: 2019-03-01 23:50
 **/
@RestController
@RequestMapping("user/")
public class UserController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,StringBoot";
    }

}
