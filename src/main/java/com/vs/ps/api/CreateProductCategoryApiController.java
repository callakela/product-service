package com.vs.ps.api;

import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.vs.ps.model.ProductCategory;
import com.vs.ps.service.ProductCategoryService;

@Controller
public class CreateProductCategoryApiController implements
		CreateProductCategoryApi {
		
	@Autowired
	ProductCategoryService productCategoryService;

	public ResponseEntity<Integer> createProductCategoryPut(

			@ApiParam(value = "Create category", required = true) @RequestParam(value = "category", required = true) String category) {

		ProductCategory productCategory = new ProductCategory();

		productCategory.setCategoryName(category);

		productCategoryService.create(productCategory);

		return new ResponseEntity<Integer>(productCategory.getCategoryId(),
				HttpStatus.OK);
	}

}
