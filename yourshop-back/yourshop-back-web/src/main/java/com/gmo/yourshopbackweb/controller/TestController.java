package com.gmo.yourshopbackweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{
    @GetMapping(path = "/test")
    public int test () {
        return 1;
    }
}
