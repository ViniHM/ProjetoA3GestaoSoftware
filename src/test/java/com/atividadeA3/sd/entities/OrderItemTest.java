package com.atividadeA3.sd.entities;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;

import static com.atividadeA3.sd.entities.enums.OrderStatus.PAID;
import static com.atividadeA3.sd.entities.enums.OrderStatus.WAITING_PAYMENT;

@ExtendWith(MockitoExtension.class)
public class OrderItemTest {

    @InjectMocks
    private OrderItem orderItem;


    @Test
    public void testOrderItemConstructor() {
        Order expectedOrder = new Order();
        Product expectedProduct = new Product();
        Integer expectedQuantity = 2;
        Double expectedPrice = 20.0;

        orderItem = new OrderItem(expectedOrder, expectedProduct, expectedQuantity, expectedPrice);

        Assertions.assertEquals(expectedOrder, orderItem.getId().getOrder());
        Assertions.assertEquals(expectedProduct, orderItem.getId().getProduct());
        Assertions.assertEquals(expectedQuantity, orderItem.getQuantity());
        Assertions.assertEquals(expectedPrice, orderItem.getPrice());
    }

    @Test
    public void testEquals() {

        Order order1 = new Order(1L, Instant.now() , WAITING_PAYMENT , new User());
        Product product1 = new Product();
        Integer quantity1 = 2;
        Double price1 = 20.0;

        Order order2 = new Order(2L, Instant.now() , PAID , new User());
        Product product2 = new Product();
        Integer quantity2 = 3;
        Double price2 = 45.0;

        OrderItem orderItem1 = new OrderItem(order1, product1, quantity1, price1);
        OrderItem orderItem2 = new OrderItem(order1, product1, quantity1, price1);
        OrderItem orderItem3 = new OrderItem(order2, product2, quantity2, price2);


        boolean result1 = orderItem1.equals(orderItem2);
        boolean result2 = orderItem1.equals(orderItem3);

        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);
    }

}
