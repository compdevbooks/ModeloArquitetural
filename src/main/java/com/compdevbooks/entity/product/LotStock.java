package com.compdevbooks.entity.product;

import com.compdevbooks.entity.AEntity;

import java.util.Date;

public class LotStock extends AEntity {
    
    private Product product;
    private Date manufacturingDate;
    private Date expirationDate;
    private int amount;
    
}
