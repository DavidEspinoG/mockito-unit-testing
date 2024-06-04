package com.david.mockito.unittest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

    @GetMapping("/hello")
    public String hello_world(){
        return "Hello you";
    }
}
