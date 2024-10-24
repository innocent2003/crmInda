package com.example.chatappdemo1.repo;

import com.example.chatappdemo1.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
