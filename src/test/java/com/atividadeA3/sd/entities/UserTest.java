package com.atividadeA3.sd.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class UserTest {

    @InjectMocks private User user;



    @Test
    void testUser(){

        Long expectedId = 1L;
        String expectedName = "John Doe";
        String expectedEmail = "john@example.com";
        String expectedPhone = "1234567890";
        String expectedPassword = "password";

        user = new User(expectedId,expectedName,expectedEmail,expectedPhone,expectedPassword);

        assertEquals(expectedId, user.getId());
        assertEquals(expectedName, user.getName());
        assertEquals(expectedEmail, user.getEmail());
        assertEquals(expectedPhone, user.getPhone());
        assertEquals(expectedPassword, user.getPassword());


    }



}
