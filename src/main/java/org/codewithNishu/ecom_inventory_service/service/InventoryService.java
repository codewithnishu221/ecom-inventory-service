package org.codewithNishu.ecom_inventory_service.service;

import java.util.Optional;

import org.codewithNishu.ecom_inventory_service.model.Inventory;
import org.codewithNishu.ecom_inventory_service.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;
    public Inventory checkStock(Long productId){
        Optional<Inventory> inv = inventoryRepository.findById(productId);
        return inv.get();
    }

    public String addProduct(Inventory inventory){
        inventoryRepository.save(inventory);
        return "Product Added!";
    }

    public String updateProduct(Inventory inventory){
        inventoryRepository.save(inventory);
        return "Product updated!";
    }

    public String deleteProduct(Long productId){
        inventoryRepository.deleteById(productId);
        return "Product deleted successfully!";

    }
}
