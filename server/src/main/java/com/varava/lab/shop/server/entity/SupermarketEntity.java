package com.varava.lab.shop.server.entity;

import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;

import javax.persistence.*;

@Entity
@Table(name = "supermarket")
@SqlResultSetMapping(name = "foundProductsMapping", classes = {
        @ConstructorResult(targetClass = SearchForAvailableProductResponse.class,
                columns = {@ColumnResult(name = "street"), @ColumnResult(name = "quantity")})
})
public class SupermarketEntity {
    @Id
    private Long id;
    private String street;
    private String postalCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
