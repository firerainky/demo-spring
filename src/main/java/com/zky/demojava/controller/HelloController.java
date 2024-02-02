package com.zky.demojava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) {
        String greeting = "Hello world, " + name;
        System.out.println(greeting);
        return greeting;
    }
}
