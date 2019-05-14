package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class testController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

