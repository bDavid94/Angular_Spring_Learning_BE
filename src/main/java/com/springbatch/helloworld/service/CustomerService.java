package com.springbatch.helloworld.service;

import com.springbatch.helloworld.domain.Customer;
import com.springbatch.helloworld.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
       return customerRepository.save(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
