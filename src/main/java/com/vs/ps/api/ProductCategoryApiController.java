package com.vs.ps.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.vs.ps.dao.ProductCategoryDAO;
import com.vs.ps.model.ProductCategory;

@Controller
public class ProductCategoryApiController implements ProductCategoryApi {

	@Autowired
	private ProductCategoryDAO productCategoryDAO;

	public ResponseEntity<List<ProductCategory>> productCategoryGet() {

		return new ResponseEntity<List<ProductCategory>>(
				productCategoryDAO.getAll(), HttpStatus.OK);
	}

}
