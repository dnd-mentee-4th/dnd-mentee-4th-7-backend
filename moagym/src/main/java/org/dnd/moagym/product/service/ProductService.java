package org.dnd.moagym.product.service;

import java.util.List;

import org.dnd.moagym.product.model.Product;

public interface ProductService {

  List<Product> getAll(String search);

  Product getById(Long id);

  void deleteById(Long id);

  Product save(Product product);

  
}
