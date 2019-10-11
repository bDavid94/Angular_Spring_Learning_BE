package com.springbatch.helloworld.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue
    private long id;

    private double value;

    @ManyToOne
    private Customer customer;

    @CreationTimestamp
    private Date createdAt;

    private String address;

    public Order() {
        // used by Jpa
    }

    public Order(double value, Customer customer, String address) {
        this.value = value;
        this.customer = customer;
        this.address = address;
    }

    public long getId() { return id; }

    public double getValue() { return value; }

    public Customer getCustomer() { return customer; }

    public Date getCreatedAt() { return createdAt; }

    public String getAddress() { return address; }
}
