//package com.springbatch.helloworld;
//
//import com.springbatch.helloworld.domain.Customer;
//import com.springbatch.helloworld.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@Component
//public class DbInit implements CommandLineRunner {
//    @Autowired
//    private CustomerRepository customerRepository;
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Db init called **************************************************************************");
//        customerRepository.deleteAll();
//        List<Customer> customers = new ArrayList<>(2);
//        Customer customer1 = new Customer("kaka", "maka", new Date());
//        Customer customer2 = new Customer("kaka2", "maka2", new Date());
//        customers.add(customer1);
//        customers.add(customer2);
//        customerRepository.saveAll(customers);
//    }
//}
