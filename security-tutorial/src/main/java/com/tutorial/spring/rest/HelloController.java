package com.tutorial.spring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {


    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Hello greeting() {
        Hello hello = new Hello();
        hello.setGreeting("Hello there.");
		return hello;
    }
}