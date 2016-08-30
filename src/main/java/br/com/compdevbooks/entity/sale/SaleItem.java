package br.com.compdevbooks.entity.sale;

import br.com.compdevbooks.model.product.LotStock;
import br.com.compdevbooks.model.product.Product;

import java.util.Set;

public class SaleItem {

    private int amount;
    private float promotionPerc; //percentual de promocao
    private float commissionPerc; //percentual de comissao
    private Product product;
    private Set<LotStock> lots;
}
