package br.com.compdevbooks.entity.purchase;

import br.com.compdevbooks.model.product.LotStock;
import br.com.compdevbooks.model.product.Product;

import java.util.Set;

public class PurchaseItem {

    private int amountRequested;
    private int amountReceived;
    private Product product;
    private Set<LotStock> lots;
}

