package com.example.demo.models;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

/**
 * Created by stenpaaro on 14/03/2018.
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    private String name;
    private String email;
    private String message;


    public Customer() {

    }

    public Customer(int customerId, String name, String email ,String message) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

