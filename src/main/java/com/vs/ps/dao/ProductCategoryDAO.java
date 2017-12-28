package com.vs.ps.dao;

import java.util.List;

import com.vs.ps.model.ProductCategory;

public interface ProductCategoryDAO {

	void create(ProductCategory category);

	List<ProductCategory> getAll();
}
