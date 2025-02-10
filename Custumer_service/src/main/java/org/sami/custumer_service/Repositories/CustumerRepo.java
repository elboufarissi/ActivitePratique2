package org.sami.custumer_service.Repositories;

import org.sami.custumer_service.Entities.Custumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustumerRepo extends JpaRepository<Custumer, Long> {
}
