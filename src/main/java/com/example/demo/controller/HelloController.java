package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

////自动装配
//@RestController
//public class HelloController {
//    //接口： http://localhost:8080/hello
//    @RequestMapping("/hello")
//    public String hello(){
//        //调用业务，接收前端的参数
//        return "hello,world";
//    }
//
//}
@Controller
@RequestMapping("/hello")
public class HelloController {
    //端口号：http://localhost:8080/hello/hello
//    在application更改项目端口号  server.port=8081
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}