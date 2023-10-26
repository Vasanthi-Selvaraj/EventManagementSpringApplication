package com.practise.eventmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/welcome")
    public String getInfo(){
        return "Welcome to Spring Boot Application";
    }
}
