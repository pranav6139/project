package com.product.project.repository;

import com.product.project.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String>{

    public Product findByid(String id);
    public List<Product> findByName(String name);
}
