package com.yanan.testjenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO:
 *
 * @version 1.0
 * @description TODO
 * @auther zhangfengbin
 * @date 2019/10/7 7:58
 **/
@Controller
public class TestController {

    @RequestMapping("/toIndex")
    public String toIndex(){
        System.out.println("123");
        return "index";
    }
}
