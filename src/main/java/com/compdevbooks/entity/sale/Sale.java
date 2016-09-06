package com.compdevbooks.entity.sale;

import com.compdevbooks.entity.AEntity;
import com.compdevbooks.entity.payment.Payment;
import com.compdevbooks.entity.person.Client;

import java.util.Date;
import java.util.Set;

public class Sale extends AEntity {

    private Date registrationDate; //data do registro
    private Date receivedDate; //data do recebimento
    private Date approvalDate; //data da aprovação
    private Date processedDate; //data do processamento
    private SaleStatus status;
    private Set<SaleItem> saleItems;
    private Client client;
    private Payment payment;

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public Date getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(Date processedDate) {
        this.processedDate = processedDate;
    }

    public SaleStatus getStatus() {
        return status;
    }

    public void setStatus(SaleStatus status) {
        this.status = status;
    }

    public Set<SaleItem> getSaleItems() {
        return saleItems;
    }

    public void setSaleItems(Set<SaleItem> saleItems) {
        this.saleItems = saleItems;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
