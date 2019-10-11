package com.springbatch.helloworld;

import com.springbatch.helloworld.domain.Customer;
import com.springbatch.helloworld.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DbInit implements CommandLineRunner {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Db init called **************************************************************************");
        customerRepository.deleteAll();
        List<Customer> customers = new ArrayList<>(2);
        Customer customer1 = new Customer("kaka", "maka", new Date(), "tkka@hasdasd.com", 5);
        Customer customer2 = new Customer("kaka2", "maka2", new Date(), "mka@hahh.com", 3);
        Customer customer3 = new Customer("Bogdan", "David", new Date(), "bogdan.david@ibm.com", 5);
        Customer customer4 = new Customer("Raluca", "Popa", new Date(), "ralu124@yahoo.com", 1);
        Customer customer5 = new Customer("Daniela", "David", new Date(), "dav.asdfree@iiia.com", 3);
        Customer customer6 = new Customer("Alex", "Tari", new Date(), "tkka@hasdasd.com", 5);
        Customer customer7 = new Customer("kaka", "maka", new Date(), "tkka@hasdasd.com", 5);
        Customer customer8 = new Customer("kaka2", "maka2", new Date(), "tkka@hasdasd.com", 5);
        Customer customer9 = new Customer("kaka", "maka", new Date(), "tkka@hasdasd.com", 6);
        Customer customer10 = new Customer("kaka2", "maka2", new Date(), "tkka@hasdasd.com", 2);
        Customer customer11 = new Customer("kaka", "maka", new Date(), "tkka@hasdasd.com", 0);
        Customer customer12 = new Customer("kaka2", "maka2", new Date(), "tkka@hasdasd.com", 4);
        Customer customer13 = new Customer("kaka", "maka", new Date(), "tkka@hasdasd.com", 4);
        Customer customer14 = new Customer("kaka2", "maka2", new Date(), "tkka@hasdasd.com", 5);
        Customer customer15 = new Customer("kaka", "maka", new Date(), "tkka@hasdasd.com", 6);
        Customer customer16 = new Customer("kaka2", "maka2", new Date(), "tkka@hasdasd.com", 2);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        customers.add(customer7);
        customers.add(customer8);
        customers.add(customer9);
        customers.add(customer10);
        customers.add(customer11);
        customers.add(customer12);
        customers.add(customer13);
        customers.add(customer14);
        customers.add(customer15);
        customers.add(customer16);
        customerRepository.saveAll(customers);
    }
}
