//package com.product.project.profiles;
//
//import com.product.project.model.Product;
//import com.product.project.model.User;
//import com.product.project.repository.ProductRepository;
//import com.product.project.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//@Profile("prod")
//public class ProdDataSourceConfig implements DataSourceConfig, CommandLineRunner {
//
//    @Autowired
//    ProductRepository productRepository;
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public void setup() {
//        System.out.println("Setting up datasource for DEV environment. ");
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Product product1 = new Product();
//        product1.setId("108");
//        product1.setName("product1_prod");
//        product1.setDescription("Milky Bar with chocolate and hazelnut");
//        product1.setType("CANDIES");
//        product1.setCategory("BARS");
//        product1.setPrice(1.99);
//        productRepository.save(product1);
//
//        Product product2 = new Product();
//        product2.setId("109");
//        product2.setName("product2_prod");
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
//        user.setUsername("prod1");
//        user.setPassword(passwordEncoder.encode("password1234"));
//        user.setEnabled(true);
//        user.setAccountNonExpired(true);
//        user.setAccountNonLocked(true);
//        user.setCredentialsNonExpired(true);
//        user.addRole("USER");
//        user.addRole("ADMIN");
//
//        userRepository.save(user);
//    }
//}
