package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Provides hints for Spring that the class plays a specific role. Our class is a a web @Controller so Spring considered it when handling incoming web requests.
@RestController //Output Controller results.

public class MainController {

    //Annotation that provides "routing" info. Tells spring that any HTTP request with "/" path should be mapped to the home() method.
    @RequestMapping("/")
    //Because of RestController annotation spring renders resulting spring directly back to the caller. In this case caller is home method and string is returned.
    public String home(){
        return "Hello comma World!";
    }
}