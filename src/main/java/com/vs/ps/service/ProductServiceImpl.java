package com.vs.ps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vs.ps.dao.ProductDAO;
import com.vs.ps.model.Product;
@Service("productServiceImpl")
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO productDAO;
		
	@Override
	public void persist(Product product) {
		productDAO.persist(product);
		
	}

	@Override
	public List<Product> getProductsByDescription(String searchText) {
		
		return productDAO.getProductsByDescription(searchText);
	}
	

}
