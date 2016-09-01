package com.compdevbooks.entity.person;

public class Client extends LegalPerson {
    
    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
