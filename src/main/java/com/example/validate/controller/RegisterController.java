package com.example.validate.controller;

import com.example.validate.bean.Personal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegisterController {

    @PostMapping
    public String register(@RequestBody @Valid Personal personal){
        return "hello + " + personal;
    }

}
