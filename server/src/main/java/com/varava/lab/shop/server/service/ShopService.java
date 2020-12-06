package com.varava.lab.shop.server.service;

import com.varava.lab.shop.api.request.SearchForAvailableProductRequest;
import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;
import com.varava.lab.shop.server.dao.SupermarketDao;
import com.varava.lab.shop.server.entity.SupermarketEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {
    private SupermarketDao supermarketDao;

    @Autowired
    public void setSupermarketDao(SupermarketDao supermarketDao) {
        this.supermarketDao = supermarketDao;
    }

    public SearchForAvailableProductResponse searchForAvailableProduct(SearchForAvailableProductRequest request) {
        List list
                    = supermarketDao.searchForAvailableProductByName(request.getProductName());
//        list.stream()
//            SupermarketEntity entity = list.get();
//            SearchForAvailableProductResponse response = new SearchForAvailableProductResponse();
//            response.setStreet(entity.getStreet());
//            response.setQuantity();
//        }
        return null;
    }
}
