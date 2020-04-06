package com.sample.myresearchproj.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @RequestMapping(value = "/greet")
    public String greet(){
        return "Greeting from research proj!!!";
    }


}
