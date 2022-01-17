package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/") //url ที่ตรงกับอันนี้ให้ทำงานตรงนี้นะ
    public String hello(){

        return "Welcome to Project";
    }

    @GetMapping("/get")
    public String get(@RequestParam String name){
        return "Hello " .concat(name);
    }

    @PostMapping("/post")
    public String post(@RequestParam String name){
        return "Hello " .concat(name);
    }
}
