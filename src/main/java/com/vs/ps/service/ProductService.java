package com.vs.ps.service;

import java.util.List;

import com.vs.ps.model.Product;

public interface ProductService {

	public void persist(Product product);
	List<Product> getProductsByDescription(String searchText);
}
