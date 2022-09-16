package com.example.springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyServiceFactoryTest {

    @Autowired
    private MyServiceFactory myServiceFactory;

    @Test
    void getService() {
        assertTrue(myServiceFactory.getService("one") instanceof MyServiceOne);
        assertTrue(myServiceFactory.getService("two") instanceof MyServiceTwo);
        assertTrue(myServiceFactory.getService("three") instanceof MyServiceThree);

        MyService one = myServiceFactory.getService("one");
        one.checkStatus();
    }
}
