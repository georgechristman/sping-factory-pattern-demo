package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class MyServiceOne implements MyService {
    @Override
    public String getType() {
        return "one";
    }

    @Override
    public void checkStatus() {
        System.out.println("MyServiceOne");
    }
}
