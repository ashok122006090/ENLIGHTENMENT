package com.sprinf.example.demo.spring;



import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String processString(String input) {
        // Example transformation logic, you can replace it with your actual logic
        return input.toUpperCase();
    }
}
