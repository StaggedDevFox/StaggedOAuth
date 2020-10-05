package com.stagged.auth.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
