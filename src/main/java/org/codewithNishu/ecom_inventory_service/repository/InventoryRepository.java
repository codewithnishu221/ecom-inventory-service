package org.codewithNishu.ecom_inventory_service.repository;

import org.codewithNishu.ecom_inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
