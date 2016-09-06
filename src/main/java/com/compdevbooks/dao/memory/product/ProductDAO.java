package com.compdevbooks.dao.memory.product;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.product.Category;
import com.compdevbooks.entity.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends AMemoryDAO<Product> {

    public List<Product> getByName(String name) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product p : database)
            if (p.getName().contains(name))
                products.add(p);
        return products;
    }

    public List<Product> getByDescription(String description) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product p : database)
            if (p.getDescription().contains(description))
                products.add(p);
        return products;
    }

    public List<Product> getByCategory(Category category) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product p : database)
            if (p.getCategory().equals(category))
                products.add(p);
        return products;
    }

}

