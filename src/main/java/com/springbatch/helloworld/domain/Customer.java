package com.springbatch.helloworld.domain;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.util.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name= "BIRTH_DATE")
    private Date birthDate;

    private String email;

    private int rating;

    @ElementCollection
    private List<String> friends;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();

    public Customer() {
        // used by jpa
    }

    public Customer(String firstName, String lastName, Date birthDate, String email, int rating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.rating = rating;
    }

    public long getId() { return id; }

    public void addOrder(Order order) { this.orders.add(order); }

    public void addFriend(String name) { this.friends.add(name); }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public Date getBirthDate() { return birthDate; }

    public String getEmail() { return email; }

    public int getRating() { return rating; }

    public List<String> getFriends() { return new ArrayList<>(friends); }

    public List<Order> getOrders() { return new ArrayList<>(orders); }
}
