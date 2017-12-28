package com.vs.ps.api;

import io.swagger.annotations.ApiParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.vs.ps.dao.ProductDAO;
import com.vs.ps.model.Product;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Controller
public class ProductSearchApiController implements ProductSearchApi {

	@Autowired
	private ProductDAO productDAO;

	public ResponseEntity<List<Product>> searchAndGetProductListGet(
			@ApiParam(value = "searchText", required = true) @RequestParam(value = "searchText", required = true) String searchText) {

		return new ResponseEntity<List<Product>>(
				productDAO.getProductsByDescription(searchText), HttpStatus.OK);
	}

}
