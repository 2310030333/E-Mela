package com.emela.repository;

import com.emela.model.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<user, String> {
    Optional<user> findByUsername(String username);  // ✅ Change this to match AuthController
}
