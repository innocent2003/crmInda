package com.example.chatappdemo1.repo;

import com.example.chatappdemo1.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
