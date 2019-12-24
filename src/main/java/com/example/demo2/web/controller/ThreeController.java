package com.example.demo2.web.controller;

import com.example.demo2.bean.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreeController {
    @PostMapping("/show")
    public Message showMessage(){
        return new Message(123,"123");
    }
}
