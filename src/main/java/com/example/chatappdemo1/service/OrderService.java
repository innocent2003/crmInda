package com.example.chatappdemo1.service;

import com.example.chatappdemo1.entity.Order;
import com.example.chatappdemo1.entity.User;
import com.example.chatappdemo1.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order save(Order user) {
        return orderRepository.save(user);
    }
}
