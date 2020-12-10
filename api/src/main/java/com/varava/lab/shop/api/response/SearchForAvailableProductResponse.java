package com.varava.lab.shop.api.response;

public class SearchForAvailableProductResponse {
    private String street;
    private int quantity;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SearchForAvailableProductResponse(String street, int quantity) {
        this.street = street;
        this.quantity = quantity;
    }

    public SearchForAvailableProductResponse() {

    }
}
