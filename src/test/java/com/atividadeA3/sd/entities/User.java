package com.atividadeA3.sd.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class User {



    @Test
    void testUser(){

        User user1 = new User();
        assertEquals("Vinicius", user1.getClass());  

    }



}
