package com.example.plumbing.service;

/** Plain POJO: no annotations. Registered as a bean in applicationContext.xml. */
public class GreetingService {

    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
