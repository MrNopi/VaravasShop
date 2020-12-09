package com.varava.lab.shop.server.endpoint;

import com.varava.lab.shop.api.endpoint.SearchApi;
import com.varava.lab.shop.api.request.SearchForAvailableProductRequest;
import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;
import com.varava.lab.shop.server.service.ShopService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ShopEndpoint implements SearchApi {

    private final ShopService shopService;

    public ShopEndpoint(ShopService shopService) {
        this.shopService = shopService;
    }

    @Override
    public List<SearchForAvailableProductResponse> searchForAvailableProduct(String name) {
        SearchForAvailableProductRequest request = new SearchForAvailableProductRequest();
        request.setProductName(name);
        return shopService.searchForAvailableProduct(request);
    }
}
