package org.dnd.moagym.product.repository;

import org.dnd.moagym.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
  
}
