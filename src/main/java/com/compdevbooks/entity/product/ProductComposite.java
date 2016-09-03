package com.compdevbooks.entity.product;

import java.util.ArrayList;
import java.util.Collection;

public class ProductComposite extends Product {

    private Collection<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

}
