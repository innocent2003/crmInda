package com.example.chatappdemo1.service;

import com.example.chatappdemo1.entity.Product;
import com.example.chatappdemo1.entity.User;
import com.example.chatappdemo1.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product user) {
        return productRepository.save(user);
    }
}
