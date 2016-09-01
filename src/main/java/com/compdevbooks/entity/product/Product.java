package com.compdevbooks.entity.product;

import com.compdevbooks.entity.AEntity;
import com.compdevbooks.entity.person.Manufacturer;

public class Product extends AEntity {

    private String name;
    private String description;
    private String image;
    private float profitMarginPerc; // percentual de margem de lucro
    private float promotionPerc; //percentual de promocao
    private float sellerCommissionPerc; //percentual de comissao
    private float purchaseValue; //valor de compra
    private float saleValue; //valor de venda
    private int minimumStock; // estoque minimo
    private int maximumStock; // estoque maximo
    private Category category; 
    private Manufacturer manufacturer;
}

