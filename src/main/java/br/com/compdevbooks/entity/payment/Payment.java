package br.com.compdevbooks.entity.payment;

import java.util.Set;

public class Payment{
    
    private PaymentMethod paymantMethod;
    private PaymentStatus paymentStatus;
    private Set<InstallmentPayment> installmentPayments;
}
