package com.varava.lab.shop.server.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    private Long id;
    private String name;
    private Integer quantity;
    @ManyToOne
    private SupermarketEntity supermarket;

    public Long getId() {
        return id;
    }

    public void setId(Long productId) {
        this.id = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public SupermarketEntity getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(SupermarketEntity supermarket) {
        this.supermarket = supermarket;
    }
}
