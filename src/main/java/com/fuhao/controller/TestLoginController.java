package com.fuhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestLoginController {

    @RequestMapping("//auth/login")
    public String login(){
        System.out.println("test");
        return "";
    }
}
