package com.seccion3.seccion3web.models;

public class Product {
    private Long id;
    private String product;
    private Long price;

    public Product() {
    }

    public Product(Long id, String product, Long price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    
}
