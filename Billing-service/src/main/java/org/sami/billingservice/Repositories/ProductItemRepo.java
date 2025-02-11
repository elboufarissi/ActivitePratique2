package org.sami.billingservice.Repositories;

import org.sami.billingservice.Entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductItemRepo extends JpaRepository<ProductItem, Long> {
    List<ProductItem> findByBillId(Long billID);
}
