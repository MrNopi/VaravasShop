package com.varava.lab.shop.server.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SupermarketDao {
    @PersistenceContext
    private EntityManager em;

    public List searchForAvailableProductByName(String name) {
        String query = "SELECT s.street, p.quantity FROM SupermarketEntity s " +
                    "JOIN ProductEntity p ON s.id=p.id" +
                    " AND p.quantity > 0 AND p.name = :name";
        return em.createQuery(query)
                    .setParameter("name", name)
                    .getResultList();
    }
}
