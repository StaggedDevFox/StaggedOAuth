package com.stagged.auth.controller;

import com.stagged.auth.dao.DynamoOperation;
import com.stagged.auth.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/add")
@RestController
public class AddUser {

    private final DynamoOperation dynamoOperation;


    @Autowired
    public AddUser(@Qualifier("dynamo") DynamoOperation dynamoOperation) {
        this.dynamoOperation = dynamoOperation;
    }

    @PostMapping("/save")
    public User createUser(@RequestBody User user) {
        return dynamoOperation.createUser(user);
    }
}
