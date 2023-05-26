package com.project.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

	@GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {

        return "Hello, "+name;
    }

    @GetMapping("/get-all-employees")
    public String getAllEmployees() {

        return "Returning Employees List Here";
    }

}
