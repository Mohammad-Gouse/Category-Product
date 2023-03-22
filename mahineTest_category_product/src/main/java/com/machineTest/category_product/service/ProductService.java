package com.machineTest.category_product.service;

import java.util.List;

import com.machineTest.category_product.entity.Product;

public interface ProductService {
	public List<Product> getAllProduct(Integer page, Integer pageSize);
	public Product getProduct(int productId);
	public void deleteProduct(int productId);
	public Product addProduct(Product product);
}