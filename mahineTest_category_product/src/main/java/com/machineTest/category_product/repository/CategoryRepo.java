package com.machineTest.category_product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.machineTest.category_product.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
