package com.atividadeA3.sd.entities;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;

@ExtendWith(MockitoExtension.class)
public class PaymentTest {

    @InjectMocks
    private Payment payment;

    @InjectMocks
    private Order order;


    @Test
    public void testPaymentConstructor() {
        Long expectedId = 1L;
        Instant expectedMoment = Instant.now();
        order = new Order();

        payment = new Payment(expectedId, expectedMoment, order);

        Assertions.assertEquals(expectedId, payment.getId());
        Assertions.assertEquals(expectedMoment, payment.getMoment());
        Assertions.assertEquals(order, payment.getOrder());
    }

    @Test
    public void testEquals() {

        Long id = 1L;
        Instant moment = Instant.now();
        Order order = new Order();

        Payment payment1 = new Payment(id, moment, order);
        Payment payment2 = new Payment(id, moment, order);
        Payment payment3 = new Payment(2L, moment, order);

        boolean result1 = payment1.equals(payment2);
        boolean result2 = payment1.equals(payment3);

        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);
    }






}
