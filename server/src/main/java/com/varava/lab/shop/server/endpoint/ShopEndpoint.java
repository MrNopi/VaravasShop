package com.varava.lab.shop.server.endpoint;

import com.varava.lab.shop.api.endpoint.SearchApi;
import com.varava.lab.shop.api.request.SearchForAvailableProductRequest;
import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopEndpoint implements SearchApi {
    @Override
    public SearchForAvailableProductResponse searchForAvailableProduct(SearchForAvailableProductRequest request) {
        return null;
    }
}
