package com.machineTest.category_product.ServiceImplementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.machineTest.category_product.entity.Product;
import com.machineTest.category_product.repository.ProductRepo;
import com.machineTest.category_product.service.ProductService;


@Service
public class ProductServiceImplement implements ProductService{
	@Autowired
	private ProductRepo proRepo;
	
	@Override
	public List<Product> getAllProduct(Integer page, Integer pageSize) {
		Pageable pageable =PageRequest.of(page, pageSize);
		Page<Product> pageProduct=proRepo.findAll(pageable);
		
		return pageProduct.toList();
	}
	
	
	@Override
	public Product getProduct(int productId) {
		
		return proRepo.findById(productId).get();
	}
	
	@Override
	public void deleteProduct(int productId) {
		
		Product product=proRepo.findById(productId).get();
		proRepo.delete(product);
		
	}
	
	@Override
	public Product addProduct(Product product) {
		
		return proRepo.save(product);
	}
	
}