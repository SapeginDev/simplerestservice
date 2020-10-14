package com.sapegindeveloper.simplerestservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/ping")
    public String getStringOk(){
        return "Ok!!!";
    }
}
