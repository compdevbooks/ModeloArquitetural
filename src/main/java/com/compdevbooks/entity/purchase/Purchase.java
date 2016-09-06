
package com.compdevbooks.entity.purchase;

import com.compdevbooks.entity.AEntity;
import com.compdevbooks.entity.payment.Payment;
import com.compdevbooks.entity.person.Manufacturer;

import java.util.Date;
import java.util.Set;

public class Purchase extends AEntity {

    private Date registrationDate; //data do registro
    private Date sentDate; //data do envio
    private Date receivedDate; //data do recebimento
    private Date processedDate; //data do processamento
    private PurchaseStatus status; 
    private Set<PurchaseItem> purchasedItems;
    private Manufacturer manufacturer;
    private Payment payment;

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(Date processedDate) {
        this.processedDate = processedDate;
    }

    public PurchaseStatus getStatus() {
        return status;
    }

    public void setStatus(PurchaseStatus status) {
        this.status = status;
    }

    public Set<PurchaseItem> getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(Set<PurchaseItem> purchasedItems) {
        this.purchasedItems = purchasedItems;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
