package com.stagged.auth.dao;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.stagged.auth.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dynamo")
public class DynamoCrud implements DynamoOperation {

    Logger logger = LoggerFactory.getLogger(DynamoCrud.class);

    @Autowired
    private DynamoDBMapper mapper;

    @Override
    public User createUser(User user) {
        try {
            mapper.save(user);
        } catch (Exception e) {
            logger.error("database insertion failed", e);
        }
        return user;
    }
}
