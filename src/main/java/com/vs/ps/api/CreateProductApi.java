package com.vs.ps.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vs.ps.model.Product;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Api(value = "createProduct", description = "the createProduct API")
public interface CreateProductApi {

	@ApiOperation(value = "Create a product with vendor id and category id", notes = "", response = Integer.class, tags = { "Product", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Product Created", response = Integer.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Integer.class) })
	@RequestMapping(value = "/createProduct", produces = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<Integer> placeOrder(

	@ApiParam(value = "Create aproduct") @RequestBody Product body

	);

}
