package com.compdevbooks.dao.memory.purchase;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.person.Manufacturer;
import com.compdevbooks.entity.purchase.Purchase;
import com.compdevbooks.entity.purchase.PurchaseStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseDAO extends AMemoryDAO<Purchase> {

    public List<Purchase> getByRegistrationDate(Date date) {
        ArrayList<Purchase> purchases = new ArrayList<>();
        for (Purchase p : database)
            if (p.getRegistrationDate().equals(date))
                purchases.add(p);
        return purchases;
    }

    public List<Purchase> getByReceivedDate(Date date) {
        ArrayList<Purchase> purchases = new ArrayList<>();
        for (Purchase p : database)
            if (p.getReceivedDate().equals(date))
                purchases.add(p);
        return purchases;
    }

    public List<Purchase> getByStatus(PurchaseStatus status) {
        ArrayList<Purchase> purchases = new ArrayList<>();
        for (Purchase p : database)
            if (p.getStatus()==status)
                purchases.add(p);
        return purchases;
    }

    public List<Purchase> getByManufacturer(Manufacturer manufacturer) {
        ArrayList<Purchase> purchases = new ArrayList<>();
        for (Purchase p : database)
            if (p.getManufacturer().equals(manufacturer))
                purchases.add(p);
        return purchases;
    }

}
