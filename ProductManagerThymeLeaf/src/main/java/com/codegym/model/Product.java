package com.codegym.model;

public class Product {
    private int product_id;
    private float price;
    private  String product_name;
    private String product_image;

    public Product() {
    }

    public Product(int product_id, String product_name, String product_image) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_image = product_image;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }
}
