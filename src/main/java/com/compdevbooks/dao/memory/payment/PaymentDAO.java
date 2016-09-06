package com.compdevbooks.dao.memory.payment;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.payment.InstallmentPayment;
import com.compdevbooks.entity.payment.Payment;
import com.compdevbooks.entity.person.Client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentDAO extends AMemoryDAO<Payment>{

    public List<Payment> getByOverdue() {
        ArrayList<Payment> payments = new ArrayList<>();
        Date todayDate = new Date();
        for (Payment p : database) {
            for (InstallmentPayment i : p.getInstallmentPayments()) {
                if (i.getDueDate().compareTo(todayDate)<0 && i.getPaymentDate()==null) {
                    payments.add(p);
                    break;
                }
            }
        }
        return payments;
    }

}
