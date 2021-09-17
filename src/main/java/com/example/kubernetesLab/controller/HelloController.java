package com.example.kubernetesLab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Katri Vidén
 * Date: 2021-09-16
 * Time: 13:22
 * Project: kubernetesLab
 * Copyright: MIT
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
