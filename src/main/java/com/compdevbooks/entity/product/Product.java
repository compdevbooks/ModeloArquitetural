package com.compdevbooks.entity.product;

import com.compdevbooks.entity.AEntity;
import com.compdevbooks.entity.person.Manufacturer;

public abstract class Product extends AEntity {

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public float getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(float purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public float getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(float saleValue) {
        this.saleValue = saleValue;
    }

    public int getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(int minimumStock) {
        this.minimumStock = minimumStock;
    }

    public int getMaximumStock() {
        return maximumStock;
    }

    public void setMaximumStock(int maximumStock) {
        this.maximumStock = maximumStock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}

