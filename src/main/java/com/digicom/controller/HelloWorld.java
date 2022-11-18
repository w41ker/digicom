package com.digicom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hi")
    public String sayHi(){
        return "Helooo!!!";
    }

}
