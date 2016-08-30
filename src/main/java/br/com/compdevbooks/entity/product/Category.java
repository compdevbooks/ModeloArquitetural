package br.com.compdevbooks.entity.product;

public class Category{
    
    private String name;
    private String description;
    private float profitMarginPerc; // percentual de margem de lucro
    private float promotionPerc; //percentual de promocao
    private float sellerCommissionPerc; //percentual de comissao
    private Category superCategory;
}

