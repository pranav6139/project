package com.product.project.service;

import com.product.project.model.Product;
import com.product.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.plugin.com.Utils;

import java.util.Collection;
import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    public String login(){
        return "login";
    }
    public String filter(){
        return "filter";
    }


    public String index(){
        return "index";
    }

    public String createProduct(){
        return "edit";
    }

    public String saveProduct(Product product){
        productRepository.save(product);
        return "redirect:/products";
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product editProduct(String id){
        return productRepository.findByid(id);
    }

    public String deleteProduct(String id){
        productRepository.deleteById(id);
        return "redirect:/products";
    }

    public List<Product> listProductByName(String name) {
        return productRepository.findByName(name);
    }




//    public Collection searchProduct(String text) {
//        return mongoTemplate.find(Query.query(new Criteria()
//                .orOperator(Criteria.where("name").regex(text, "i"),
//                        Criteria.where("type").regex(text, "i"),
//                        Criteria.where("category").regex(text, "i"))
//        ), Product.class);
//    }

}
