package com.compdevbooks.entity.product;

import com.compdevbooks.entity.AEntity;

public class Category extends AEntity {
    
    private String name;
    private String description;
    private float profitMarginPerc; // percentual de margem de lucro
    private float promotionPerc; //percentual de promocao
    private float sellerCommissionPerc; //percentual de comissao
    private Category superCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getProfitMarginPerc() {
        return profitMarginPerc;
    }

    public void setProfitMarginPerc(float profitMarginPerc) {
        this.profitMarginPerc = profitMarginPerc;
    }

    public float getPromotionPerc() {
        return promotionPerc;
    }

    public void setPromotionPerc(float promotionPerc) {
        this.promotionPerc = promotionPerc;
    }

    public float getSellerCommissionPerc() {
        return sellerCommissionPerc;
    }

    public void setSellerCommissionPerc(float sellerCommissionPerc) {
        this.sellerCommissionPerc = sellerCommissionPerc;
    }

    public Category getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(Category superCategory) {
        this.superCategory = superCategory;
    }
}

