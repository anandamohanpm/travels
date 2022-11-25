package com.example.travels;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Train {
    @GetMapping("/trainticket")
    public String getData(){
        return "Please book your train ticket here, Thank you for using irctc";
    }

}