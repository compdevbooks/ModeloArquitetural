package com.compdevbooks.dao.memory.product;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.product.LotStock;
import com.compdevbooks.entity.product.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class LotStockDAO extends AMemoryDAO<LotStock> {

    public List<LotStock> getByProduct(Product product) {
        ArrayList<LotStock> lots = new ArrayList<>();
        for (LotStock l : database)
            if (l.getProduct().equals(product))
                lots.add(l);
        return lots;
    }

    public List<LotStock> getByManufacturingDate(Date date) {
        ArrayList<LotStock> lots = new ArrayList<>();
        for (LotStock l : database)
            if (l.getManufacturingDate().equals(date))
                lots.add(l);
        return lots;
    }

    public List<LotStock> getByExpirationDate(Date date) {
        ArrayList<LotStock> lots = new ArrayList<>();
        for (LotStock l : database)
            if (l.getManufacturingDate().compareTo(date)<0)
                lots.add(l);
        return lots;
    }

    public List<LotStock> getByAmountLessThan(int amount) {
        ArrayList<LotStock> lots = new ArrayList<>();
        for (LotStock l : database)
            if (l.getAmount() <= amount)
                lots.add(l);
        return lots;
    }

    public HashMap<Product,List<LotStock>> getByProductAmountLessThan(int amount) {
        HashMap<Product, List<LotStock>> products = new HashMap<>();



        return products;
    }
}
