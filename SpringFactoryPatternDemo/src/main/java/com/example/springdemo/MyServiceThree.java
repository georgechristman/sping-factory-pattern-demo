package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class MyServiceThree implements MyService {
    @Override
    public String getType() {
        return "three";
    }

    @Override
    public void checkStatus() {
        System.out.println("MyServiceThree");
    }
}
