package com.product.project;

import com.product.project.model.Product;
import com.product.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Arrays;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ProjectApplication implements CommandLineRunner {

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	    Product product1 = new Product();
	    product1.setId("101");
        product1.setName("Milky Bar");
        product1.setDescription("Milky Bar with chocolate and hazelnut");
        product1.setType("CANDIES");
        product1.setCategory("BARS");
        product1.setPrice(1.99);

        productRepository.save(product1);

        Product product2 = new Product();
        product2.setId("102");
        product2.setName("Almond Bar");
        product2.setDescription("Almond Bar with chocolate and honey");
        product2.setType("CANDIES");
        product2.setCategory("BARS");
        product2.setPrice(2.99);

        productRepository.save(product2);
	}
}
