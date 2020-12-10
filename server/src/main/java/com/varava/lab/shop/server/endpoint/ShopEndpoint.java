package com.varava.lab.shop.server.endpoint;

import com.varava.lab.shop.api.endpoint.SearchApi;
import com.varava.lab.shop.api.request.SearchForAvailableProductRequest;
import com.varava.lab.shop.api.response.SearchForAvailableProductResponse;
import com.varava.lab.shop.server.entity.ProductEntity;
import com.varava.lab.shop.server.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ShopEndpoint {
    private final ShopService shopService;

    public ShopEndpoint(ShopService shopService) {
        this.shopService = shopService;
    }
    @RequestMapping(value = "/available/{product}", method = RequestMethod.GET)
    public String searchForAvailableProduct(Model model, @PathVariable String product) {
        SearchForAvailableProductRequest request = new SearchForAvailableProductRequest();
        request.setProductName(product);
        List<ProductEntity> products
                    = shopService.searchForAvailableProduct(request);
        model.addAttribute("products", products);
        return "availableProduct";
    }

    @RequestMapping("/")
    String index() {
        return "index";
    }
}
