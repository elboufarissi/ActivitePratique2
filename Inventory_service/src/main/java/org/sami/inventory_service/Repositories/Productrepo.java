package org.sami.inventory_service.Repositories;

import org.sami.inventory_service.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepo extends JpaRepository<Product, Long> {
}
