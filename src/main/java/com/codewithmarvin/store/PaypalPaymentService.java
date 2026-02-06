package com.codewithmarvin.store;

import org.springframework.stereotype.Service;


public class PaypalPaymentService implements  PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
