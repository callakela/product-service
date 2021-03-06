package com.vs.ps.api;

import io.swagger.annotations.ApiParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.vs.ps.model.Product;
import com.vs.ps.service.ProductService;

@Controller
public class ProductSearchApiController implements ProductSearchApi {
	
	@Autowired
	private ProductService productService;

	public ResponseEntity<List<Product>> searchAndGetProductListGet(
			@ApiParam(value = "searchText", required = true) @RequestParam(value = "searchText", required = true) String searchText) {

		return new ResponseEntity<List<Product>>(
				productService.getProductsByDescription(searchText), HttpStatus.OK);
	}

}
