package com.stagged.auth.dao;

import com.stagged.auth.models.User;

public interface DynamoOperation {

    User createUser(User user);
}
