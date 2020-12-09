package com.varava.lab.shop.api.endpoint;

import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/search")
public interface SearchApi {

    @RequestMapping(value = "/product/{product}/available", method = RequestMethod.GET)
    List<SearchForAvailableProductResponse> searchForAvailableProduct(@PathVariable(value = "product") String name);
}