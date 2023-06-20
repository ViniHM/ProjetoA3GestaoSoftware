package com.atividadeA3.sd.entities;

import org.junit.jupiter.api.Assertions;
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

    @Test
    public void testEquals() {

        User user1 = new User(1L, "Vinicius", "Vinicius@gmail.com", "1234567890", "password");
        User user2 = new User(1L, "Gabriel", "Gabriel@gmail.com", "9876543210", "password");
        User user3 = new User(2L, "Giovani", "Giovani@gmail.com", "1234567890", "password");

        boolean result1 = user1.equals(user2);
        boolean result2 = user1.equals(user3);

        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);
    }

    @Test
    public void testHashCode() {
        User user1 = new User(1L, "Gabriel", "Gabriel@gmail.com", "1234567890", "password");
        User user2 = new User(1L, "Giovani", "Giovani@gmail.com", "9876543210", "password");

        int hashCode1 = user1.hashCode();
        int hashCode2 = user2.hashCode();

        Assertions.assertEquals(hashCode1, hashCode2);
    }



}
