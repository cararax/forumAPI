package com.carara.forumapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oi")
public class HelloController {
    @ResponseBody
    @GetMapping
    public String hello(){
        return "hello";
    }
}
