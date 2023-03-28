package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrudRepo extends MongoRepository <CrudModel,Integer> {

}
