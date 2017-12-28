package com.vs.ps.service;

import java.util.List;

import com.vs.ps.model.ProductCategory;

public interface ProductCategoryService {
	void create(ProductCategory category);

	List<ProductCategory> getAll();
}
