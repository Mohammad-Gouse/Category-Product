package com.machineTest.category_product.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int categoryId;
	private String categoryName;
	
//	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
//	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cp_fk", referencedColumnName="category_id")
	private List<Product> products;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Category(int categoryId, String categoryName, List<Product> products) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.products = products;
	}



	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Product> getProducts() {
		return products;
		
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
