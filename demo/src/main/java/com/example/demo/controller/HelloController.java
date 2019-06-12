package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.*;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getHelloMessage() {
        //injecting sonar issue
        try {
    System.out.print("hello");
  }
  catch (NullPointerException e) {
   System.out.print(e);
  }
        return "Hello World Demo";
    }
}
