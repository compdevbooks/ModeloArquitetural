package br.com.compdevbooks.entity.person;

import br.com.compdevbooks.entity.product.Product;

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
