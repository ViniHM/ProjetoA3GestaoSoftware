package com.atividadeA3.sd.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ProductTest {

    @InjectMocks private Product product;


    @Test
    void testProduct(){

        Long expectedId = 1L;
        String expectedName = "expectedName";
        String expectedDescription = "expectedDescription";
        Double expectedPrice = 5.5;
        String expectedImgUrl = "expectedImgUrl";

        product = new Product(expectedId, expectedName, expectedDescription, expectedPrice, expectedImgUrl);

        assertEquals(expectedId, product.getId());
        assertEquals(expectedName, product.getName());
        assertEquals(expectedDescription, product.getDescription());
        assertEquals(expectedPrice, product.getPrice());
        assertEquals(expectedImgUrl, product.getImgUrl());
    }

    @Test
    public void testEquals() {

        Product product1 = new Product(1L, "Tv", "Ver Tv", 10.0 , "imagem da TV");
        Product product2 = new Product(1L, "Computador", "Mexer na internet", 20.0, "imagem do pc");
        Product product3 = new Product(2L, "Tv", "Ver Tv", 10.0 , "imagem da TV");

        boolean result1 = product1.equals(product2);
        boolean result2 = product1.equals(product3);

        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);

    }







}
