package com.kp.SpringBootRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* This is simple Hello world app with Rest API.*/
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String hello() {
        return "Hello spring boot rest World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}