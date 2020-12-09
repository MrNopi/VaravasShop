package com.varava.lab.shop.api.endpoint;

import com.varava.lab.shop.api.request.SearchForAvailableProductRequest;
import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;

import java.util.List;

public interface SearchApi {
    List<SearchForAvailableProductResponse> searchForAvailableProduct(SearchForAvailableProductRequest request);
}
