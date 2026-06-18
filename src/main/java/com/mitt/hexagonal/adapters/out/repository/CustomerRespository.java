package com.mitt.hexagonal.adapters.out.repository;

import com.mitt.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRespository extends MongoRepository<CustomerEntity, String> {

}
