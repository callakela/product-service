package com.vs.ps.dao;

import java.util.List;

import com.vs.ps.model.Product;

public interface ProductDAO {

	void persist(Product product);

	List<Product> getProductsByDescription(String searchText);
}
