package com.example.chatappdemo1.repo;

import com.example.chatappdemo1.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
