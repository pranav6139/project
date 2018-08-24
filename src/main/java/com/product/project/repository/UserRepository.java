package com.product.project.repository;

import com.product.project.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

    public User findByUsernameAndPassword(String username,String password);
    public User findByUsername(String username);

}
