package com.product.project.service;

import com.product.project.model.User;
import com.product.project.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
@SpringBootTest
public class CustUserDetailServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    CustUserDetailService custUserDetailService;

    @Before
    public void setUp() throws Exception {

            MockitoAnnotations.initMocks(this);
    }

    @Test
    public void loadUserByUsernameTest() {

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        User user = new User();
        user.setUsername("user");
        user.setPassword(passwordEncoder.encode("password"));
        user.setEnabled(true);
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.addRole("USER");
        user.addRole("ADMIN");

        when(userRepository.findByUsername(anyString())).thenReturn(user);
        UserDetails result=custUserDetailService.loadUserByUsername("user");
        assertEquals("user",result.getUsername());
    }

}