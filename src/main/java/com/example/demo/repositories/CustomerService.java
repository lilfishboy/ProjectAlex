package com.example.demo.repositories;

import com.example.demo.models.Customer;

import java.util.Optional;

/**
 * Created by stenpaaro on 14/03/2018.
 */
public interface CustomerService {

    void save(Customer customer);
    void delete(int id);
    Optional<Customer> findById(int id);

}