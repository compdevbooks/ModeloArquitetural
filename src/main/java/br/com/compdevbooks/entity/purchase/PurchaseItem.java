package br.com.compdevbooks.entity.purchase;

import br.com.compdevbooks.entity.AEntity;
import br.com.compdevbooks.entity.product.LotStock;
import br.com.compdevbooks.entity.product.Product;

import java.util.Set;

public class PurchaseItem {

    private int amountRequested;
    private int amountReceived;
    private Product product;
    private Set<LotStock> lots;
}

