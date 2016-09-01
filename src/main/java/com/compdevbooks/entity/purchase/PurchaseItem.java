package com.compdevbooks.entity.purchase;

import com.compdevbooks.entity.product.LotStock;
import com.compdevbooks.entity.product.Product;

import java.util.Set;

public class PurchaseItem {

    private int amountRequested;
    private int amountReceived;
    private Product product;
    private Set<LotStock> lots;
}

