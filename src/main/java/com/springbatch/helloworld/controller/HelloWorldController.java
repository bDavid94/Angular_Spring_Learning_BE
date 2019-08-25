package com.springbatch.helloworld.controller;

import com.springbatch.helloworld.domain.Customer;
import com.springbatch.helloworld.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/hello",
                produces = "application/json")
public class HelloWorldController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/test")
    public String test() {
        return "Hello world";
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }
}
