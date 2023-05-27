package com.ycfengzi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：YCFengZi
 * @Date：2023/5/26 16:45
 */
// 请求处理类
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Controller");
        return "Hello Controller";
    }
}
