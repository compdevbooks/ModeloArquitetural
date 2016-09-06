package com.compdevbooks.entity.payment;

import com.compdevbooks.entity.AEntity;

import java.util.Set;

public class Payment extends AEntity {
    
    private PaymentMethod paymantMethod;
    private PaymentStatus paymentStatus;
    private Set<InstallmentPayment> installmentPayments;

    public PaymentMethod getPaymantMethod() {
        return paymantMethod;
    }

    public void setPaymantMethod(PaymentMethod paymantMethod) {
        this.paymantMethod = paymantMethod;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Set<InstallmentPayment> getInstallmentPayments() {
        return installmentPayments;
    }

    public void setInstallmentPayments(Set<InstallmentPayment> installmentPayments) {
        this.installmentPayments = installmentPayments;
    }
}
