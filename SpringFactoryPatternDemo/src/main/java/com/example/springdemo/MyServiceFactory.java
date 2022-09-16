package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyServiceFactory {

    @Autowired
    private List<MyService> myServices;

    private final Map<String, MyService> myServiceCache = new HashMap<>();

    @PostConstruct
    public void initMyServiceCache() {
        for(MyService myService : myServices) {
            myServiceCache.put(myService.getType(), myService);
        }
    }

    public MyService getService(String type) {
        MyService myService = myServiceCache.get(type);
        if(myService == null) throw new RuntimeException("Unknown service type");
        return myService;
    }
}
