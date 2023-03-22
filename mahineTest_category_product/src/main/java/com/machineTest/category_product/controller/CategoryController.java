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

import com.machineTest.category_product.entity.Category;
import com.machineTest.category_product.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {
	 @Autowired
	private CategoryService catSer;
	
	@GetMapping("/categories")
	public List<Category> getAllCategory(@RequestParam(value="page",defaultValue="1",required=false
	)Integer page,@RequestParam(value="pageSize",defaultValue="1",required=false)Integer pageSize)
	{
		return this.catSer.getAllCategory(page,pageSize);
	}
	
	@GetMapping("/categories/{CategoryId}")
	public Category getCategory(@PathVariable int CategoryId)
	{
		return this.catSer.getCategory(CategoryId);
	}
	
	@PostMapping("/categories")
	public Category addCategory(@RequestBody Category category) {
		
		return this.catSer.addCategory(category);
	}
	
	@DeleteMapping ("/categories/{CategoryId}")
	public void deleteCategory(@PathVariable int CategoryId) {
		this.catSer.deleteCategory(CategoryId);
	}
	
	@PutMapping("/categories/{CategoryId}")
	public Category updateCategory(@RequestBody Category category) {
		
		return this.catSer.addCategory(category);
	}
	
	
}

