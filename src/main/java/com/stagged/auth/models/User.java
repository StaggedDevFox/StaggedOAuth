package com.stagged.auth.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@DynamoDBTable(tableName="staggedUsers")
public class User {

    @DynamoDBHashKey
    private String email;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private int age;

    @DynamoDBAttribute
    private String gender;

    public User(@JsonProperty("email") String email, @JsonProperty("name") String name,
                @JsonProperty("age") int age, @JsonProperty("gender") String gender) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
