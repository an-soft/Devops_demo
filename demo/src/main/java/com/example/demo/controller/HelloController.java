package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getHelloMessage() {
        //injecting sonar issue
         //System.out.print("hello");
        return "Hello World Demo";
    }
}
