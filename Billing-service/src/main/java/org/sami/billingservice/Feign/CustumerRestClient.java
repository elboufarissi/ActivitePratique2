package org.sami.billingservice.Feign;

import org.sami.billingservice.Models.Custumer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "custumer-service")
public interface CustumerRestClient {
    @GetMapping(path = "/api/custumers/{id}")
    Custumer findCustumerById(@PathVariable long id);

    @GetMapping(path = "/api/custumers")
    PagedModel<Custumer> getAllCustumers();
}
