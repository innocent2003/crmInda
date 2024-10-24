package com.example.chatappdemo1.repo;

import com.example.chatappdemo1.entity.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}
