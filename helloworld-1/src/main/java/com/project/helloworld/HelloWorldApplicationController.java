package com.project.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApplicationController {

	@GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {

        return "Hello, "+name;
    }

}
