package com.machineTest.category_product.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.machineTest.category_product.entity.Category;
import com.machineTest.category_product.repository.CategoryRepo;
import com.machineTest.category_product.service.CategoryService;

@Service
public class CategoryServiceImplement implements CategoryService{
	@Autowired
	private CategoryRepo catRepo;
	
	@Override
	public List<Category> getAllCategory(Integer page, Integer pageSize) {
		
		Pageable pageable =PageRequest.of(page, pageSize);
		Page<Category> pageCategory=catRepo.findAll(pageable);
		
		return pageCategory.toList();
	}
	
	@Override
	public Category getCategory(int cataegoryId) {
		
		return catRepo.findById(cataegoryId).get();
	}
	
	@Override
	public void deleteCategory(int cataegoryId) {

		Category category=catRepo.findById(cataegoryId).get();
		catRepo.delete(category);
		
	}
	
	@Override
	public Category addCategory(Category category) {
		
		return catRepo.save(category);
	}
	
	
}

