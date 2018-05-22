package com.example.demo.repositories;

import com.example.demo.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by stenpaaro on 14/03/2018.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    /*public Customer findByName(String name) {
        return customerRepository.findCustomerByName(name);
    }*/

    public List<Customer> fetchAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    /*public Customer findByFirstName(String name){
        return customerRepository.findCustomerByName(name);
    }*/
}