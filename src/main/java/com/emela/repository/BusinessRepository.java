package com.emela.repository;


import com.emela.model.business;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BusinessRepository extends MongoRepository<business, String> {
    List<business> findByCategory(String category);
}

