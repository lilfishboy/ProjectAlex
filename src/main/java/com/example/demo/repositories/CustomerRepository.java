package com.example.demo.repositories;

import com.example.demo.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by stenpaaro on 14/03/2018.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    //Customer findCustomerByName(String name);


}
