package com.varava.lab.shop.server.dao;

import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SupermarketDao {

    @PersistenceContext
    private EntityManager em;

    public List<SearchForAvailableProductResponse> searchForAvailableProductByName(String name) {
        String query = "SELECT supermarket.street, product.quantity FROM supermarket " +
                "JOIN product ON supermarket.id=product.supermarket_id " +
                "AND product.quantity > 0 AND product.name = :name";
        return em.createNativeQuery(query, "foundProductsMapping")
                .setParameter("name", name)
                .getResultList();
    }
}
