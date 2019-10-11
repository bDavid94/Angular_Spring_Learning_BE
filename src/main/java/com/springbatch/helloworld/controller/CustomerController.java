package com.springbatch.helloworld.controller;

import com.springbatch.helloworld.domain.Customer;
import com.springbatch.helloworld.service.CustomerService;
import com.springbatch.helloworld.util.SearchCriteriaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/customer",
                produces = "application/json")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/test")
    public String test() {
        return "Hello world";
    }

    @GetMapping("/all")
    public Page<Customer> getCustomers(@RequestParam(name = "page", defaultValue = "0") int page,
                                       @RequestParam(name = "size", defaultValue = "6") int size,
                                       @RequestParam(name = "filters", required = false) List<SearchCriteriaDto> filters,
                                       @RequestParam(name = "direction", required = false) String direction,
                                       @RequestParam(name = "sortField", required = false) String sortField) {
        if (sortField == null || direction == null) {
            return customerService.findAll(page, size, filters);
        } else {
            return customerService.findAll(page, size, direction, sortField, filters);
        }
    }
}
