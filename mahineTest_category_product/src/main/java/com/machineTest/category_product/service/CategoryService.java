package com.machineTest.category_product.service;

import java.util.List;
import com.machineTest.category_product.entity.Category;

public interface CategoryService {
	public List<Category> getAllCategory(Integer page, Integer pageSize); 
	public Category getCategory(int cataegoryId); 
	public void deleteCategory(int cataegoryId); 
	public Category addCategory(Category category); 
}

