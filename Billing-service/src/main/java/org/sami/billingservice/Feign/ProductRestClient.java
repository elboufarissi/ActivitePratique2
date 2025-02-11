package org.sami.billingservice.Feign;

import org.sami.billingservice.Models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service")
public interface ProductRestClient {

    @GetMapping(path = "/api/products/{id}")
    Product findProductById(@PathVariable long id);

    @GetMapping(path = "/api/products")
    PagedModel<Product> getAllProducts();
}
