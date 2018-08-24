package com.product.project;

import com.product.project.model.Product;
import com.product.project.model.User;
import com.product.project.repository.ProductRepository;
import com.product.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ProjectApplication implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


//        Product product1 = new Product();
//        product1.setId("101");
//        product1.setName("Milky Bar");
//        product1.setDescription("Milky Bar with chocolate and hazelnut");
//        product1.setType("CANDIES");
//        product1.setCategory("BARS");
//        product1.setPrice(1.99);
//        productRepository.save(product1);
//
//        Product product2 = new Product();
//        product2.setId("102");
//        product2.setName("Almond Bar");
//        product2.setDescription("Almond Bar with chocolate and honey");
//        product2.setType("CANDIES");
//        product2.setCategory("BARS");
//        product2.setPrice(2.99);
//        productRepository.save(product2);
//
//
//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//        User user = new User();
//        user.setUsername("abcd12345");
//        user.setPassword(passwordEncoder.encode("secret"));
//        user.setEnabled(true);
//        user.setAccountNonExpired(true);
//        user.setAccountNonLocked(true);
//        user.setCredentialsNonExpired(true);
//        user.addRole("USER");
//        user.addRole("ADMIN");
//
//        userRepository.save(user);
//
//        User user2 = new User();
//        user2.setUsername("anshul");
//        user2.setPassword(passwordEncoder.encode("password"));
//        user2.setEnabled(true);
//        user2.setAccountNonExpired(true);
//        user2.setAccountNonLocked(true);
//        user2.setCredentialsNonExpired(true);
//        user2.addRole("USER");
//
//        userRepository.save(user2);

    }
}
