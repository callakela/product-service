package com.vs.ps.api;

import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.vs.ps.dao.ProductDAO;
import com.vs.ps.model.Product;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Controller
public class CreateProductApiController implements CreateProductApi {

	@Autowired
	private ProductDAO productDAO;

	public ResponseEntity<Integer> placeOrder(
			@ApiParam(value = "Create aproduct") @RequestBody Product product) {

		productDAO.persist(product);

		return new ResponseEntity<Integer>(product.getProductId(),
				HttpStatus.OK);
	}

}
