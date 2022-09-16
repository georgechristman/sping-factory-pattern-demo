package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class MyServiceTwo implements MyService {
    @Override
    public String getType() {
        return "two";
    }

    @Override
    public void checkStatus() {
        System.out.println("MyServiceTwo");
    }
}
