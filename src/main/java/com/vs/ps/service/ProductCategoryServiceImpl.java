package com.vs.ps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vs.ps.dao.ProductCategoryDAO;
import com.vs.ps.model.ProductCategory;

@Service("productCategoryService")
@Transactional
public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	ProductCategoryDAO productCategoryDAO;
	
	@Override
	public void create(ProductCategory category) {
		productCategoryDAO.create(category);
	}

	@Override
	public List<ProductCategory> getAll() {
		return productCategoryDAO.getAll();
	}

}
