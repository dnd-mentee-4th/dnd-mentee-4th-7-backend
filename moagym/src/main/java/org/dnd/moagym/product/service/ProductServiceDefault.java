package org.dnd.moagym.product.service;

import java.util.List;

import org.dnd.moagym.product.model.Product;
import org.dnd.moagym.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceDefault implements ProductService {

  private final ProductRepository productRepository;

	@Override
	public List<Product> getAll(String search) {
		return productRepository.findAll();
	}

	@Override
	public Product getById(Long id) {
		return productRepository.findById(id).orElseThrow();
	}

	@Override
	public void deleteById(Long id) {
    productRepository.deleteById(id);
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

}
