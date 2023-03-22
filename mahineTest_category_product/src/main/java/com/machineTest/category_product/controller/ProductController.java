package com.machineTest.category_product.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.machineTest.category_product.entity.Product;
import com.machineTest.category_product.service.ProductService;

@RequestMapping("/api")
@RestController
public class ProductController {
	@Autowired
	private ProductService proSer;
	
	@GetMapping("/products")
	public List<Product> getAllProduct(@RequestParam(value="page",defaultValue="1",required=false
	)Integer page,@RequestParam(value="pageSize",defaultValue="1",required=false)Integer pageSize){
		return this.proSer.getAllProduct(page,pageSize);
	}
	
	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable int productId) {
		return this.proSer.getProduct(productId);
	}
	
	@DeleteMapping ("/products/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		
		this.proSer.deleteProduct(productId);
	}
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product Product) {
		
		return this.proSer.addProduct(Product);
	}
	
	@PutMapping("/products/{productId}")
	public Product updateProduct(@RequestBody Product Product) {
		
		return this.proSer.addProduct(Product);
	}
}



