package com.product.project.service;

import com.product.project.model.Product;
import com.product.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public String login(){
        return "login";
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

}
