package com.zky.demojava.controller;

import com.zky.demojava.pojo.LombokPOJO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(String name) {
        LombokPOJO pojo = new LombokPOJO();
        pojo.test();

        String greeting = "Hello world, " + name;
        System.out.println(greeting);
        return greeting;
    }
}
