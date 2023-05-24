package com.matheus.paymentservice.service;

import com.matheus.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
