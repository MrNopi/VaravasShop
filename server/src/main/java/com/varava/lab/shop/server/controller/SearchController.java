package com.varava.lab.shop.server.controller;


import com.varava.lab.shop.api.request.SearchForAvailableProductRequest;
import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;
import com.varava.lab.shop.server.endpoint.ShopEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    private final ShopEndpoint endpoint;

    public SearchController(ShopEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    @GetMapping("/search")
    public List<SearchForAvailableProductResponse> searchProduct(@RequestParam(value = "product") String name) {
        SearchForAvailableProductRequest request = new SearchForAvailableProductRequest();
        request.setProductName(name);
        return endpoint.searchForAvailableProduct(request);
    }
}
