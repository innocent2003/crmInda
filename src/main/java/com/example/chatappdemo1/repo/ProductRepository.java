package com.example.chatappdemo1.repo;

import com.example.chatappdemo1.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
