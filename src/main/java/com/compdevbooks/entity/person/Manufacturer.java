package com.compdevbooks.entity.person;

import com.compdevbooks.entity.product.Product;

import java.util.Set;

public class Manufacturer extends LegalPerson {

    private Set<Product> productList;

    public Set<Product> getProductList() {
        return productList;
    }

    public void setProductList(Set<Product> productList) {
        this.productList = productList;
    }
}
