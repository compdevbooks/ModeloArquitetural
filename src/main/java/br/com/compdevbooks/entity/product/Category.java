package br.com.compdevbooks.entity.product;

import br.com.compdevbooks.entity.AEntity;

public class Category extends AEntity {
    
    private String name;
    private String description;
    private float profitMarginPerc; // percentual de margem de lucro
    private float promotionPerc; //percentual de promocao
    private float sellerCommissionPerc; //percentual de comissao
    private Category superCategory;
}

