package com.example.chatappdemo1.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@Getter
@Setter
public class Customer {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;

    // Getters and Setters
}
