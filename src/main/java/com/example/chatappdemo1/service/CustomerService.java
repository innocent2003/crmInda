package com.example.chatappdemo1.service;

import com.example.chatappdemo1.entity.Customer;
import com.example.chatappdemo1.entity.User;
import com.example.chatappdemo1.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer save(Customer user) {
        return customerRepository.save(user);
    }
}
