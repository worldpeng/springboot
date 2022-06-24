package com.example.demo;

import com.example.demo.pojo.Dog;
import com.example.demo.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//单元测试
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Person dog;

    @Test
    void contextLoads() {
        System.out.println(dog);
    }

}
