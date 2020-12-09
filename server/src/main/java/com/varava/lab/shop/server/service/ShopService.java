package com.varava.lab.shop.server.service;

import com.varava.lab.shop.api.request.SearchForAvailableProductRequest;
import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;
import com.varava.lab.shop.server.dao.SupermarketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    private SupermarketDao supermarketDao;

    @Autowired
    public void setSupermarketDao(SupermarketDao supermarketDao) {
        this.supermarketDao = supermarketDao;
    }

    public List<SearchForAvailableProductResponse> searchForAvailableProduct(SearchForAvailableProductRequest request) {
        return supermarketDao.searchForAvailableProductByName(request.getProductName());
    }
}
