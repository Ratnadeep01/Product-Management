package com.example.ProductAPI.models;

public class Products {
    private int prodId;
    private String prodName;
    private int price;

    public Products() {

    }

    public Products(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return this.prodId;
    }
    public String getProdName() {
        return this.prodName;
    }
    public int getPrice() {
        return this.price;
    }
    
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
