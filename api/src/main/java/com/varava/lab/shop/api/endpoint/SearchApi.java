package com.varava.lab.shop.api.endpoint;

import com.varava.lab.shop.api.request.SearchForAvailableProductRequest;
import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;

public interface SearchApi {
    SearchForAvailableProductResponse searchForAvailableProduct(SearchForAvailableProductRequest request);
}
