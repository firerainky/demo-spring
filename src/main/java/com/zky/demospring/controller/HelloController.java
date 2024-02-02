package com.zky.demospring.controller;

import com.zky.demospring.pojo.LombokPOJO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) {
        LombokPOJO pojo = new LombokPOJO();
        pojo.test();

        String greeting = "Hello world, " + name;
        System.out.println(greeting);
        return greeting;
    }
}
