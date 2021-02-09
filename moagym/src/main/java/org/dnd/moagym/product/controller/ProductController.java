package org.dnd.moagym.product.controller;

import java.util.List;

import org.dnd.moagym.product.model.Product;
import org.dnd.moagym.product.service.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

  private final ProductService productService;

  @GetMapping("/")
  public List<Product> getAll(String searchParam) {
    return productService.getAll(searchParam);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    productService.deleteById(id);
  }

  @PostMapping("/")
  public Product save(@RequestBody Product product) {
    return productService.save(product);
  }

  @GetMapping("/{id}")
  public Product getById(@PathVariable Long id) {
    return productService.getById(id);
  }
  

  
}
