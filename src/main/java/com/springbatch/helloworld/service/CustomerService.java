package com.springbatch.helloworld.service;

import com.springbatch.helloworld.domain.Customer;
import com.springbatch.helloworld.repository.CustomerRepository;
import com.springbatch.helloworld.util.SearchCriteriaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    public Page<Customer> findAll(int page, int size, String sortDirection, String sortField, List<SearchCriteriaDto> filters) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortField);
        return customerRepository.findAll(PageRequest.of(page, size, sort));
    }

    public Page<Customer> findAll(int page, int size, List<SearchCriteriaDto> filters) {
        return customerRepository.findAll(PageRequest.of(page, size));
    }
}
