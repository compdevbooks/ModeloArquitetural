package com.compdevbooks.entity.payment;

import com.compdevbooks.entity.AEntity;

import java.util.Set;

public class Payment extends AEntity {
    
    private PaymentMethod paymantMethod;
    private PaymentStatus paymentStatus;
    private Set<InstallmentPayment> installmentPayments;
}
