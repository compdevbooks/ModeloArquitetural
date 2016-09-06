package com.compdevbooks.dao.memory.sale;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.person.Client;
import com.compdevbooks.entity.sale.Sale;
import com.compdevbooks.entity.sale.SaleStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleDAO extends AMemoryDAO<Sale>{

    public List<Sale> getByRegistrationDate(Date date) {
        ArrayList<Sale> sales = new ArrayList<>();
        for (Sale s : database)
            if (s.getRegistrationDate().equals(date))
                sales.add(s);
        return sales;
    }

    public List<Sale> getByReceivedDate(Date date) {
        ArrayList<Sale> sales = new ArrayList<>();
        for (Sale s : database)
            if (s.getReceivedDate().equals(date))
                sales.add(s);
        return sales;
    }

    public List<Sale> getByStatus(SaleStatus status) {
        ArrayList<Sale> sales = new ArrayList<>();
        for (Sale s : database)
            if (s.getStatus()==status)
                sales.add(s);
        return sales;
    }

    public List<Sale> getByClient(Client client) {
        ArrayList<Sale> sales = new ArrayList<>();
        for (Sale s : database)
            if (s.getClient().equals(client))
                sales.add(s);
        return sales;
    }

}
