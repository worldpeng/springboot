package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//本身就是spring的一个组件
//@SpringBootApplication 来标注一个主程序类,说明这是一个Spring Boot应用
//Springboot 程序主入口
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
