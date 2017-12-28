package com.vs.ps.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vs.ps.model.Product;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Api(value = "productList", description = "the productList API")
public interface ProductListApi {

	@ApiOperation(value = "Get Product List by Category", notes = "Get alal products for agiven category", response = Product.class, responseContainer = "List", tags = { "Product", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An array of price estimates by product", response = Product.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Product.class) })
	@RequestMapping(value = "/productList", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<Product>> productListGet(
			@ApiParam(value = "vendor id", required = true) @RequestParam(value = "vendorId", required = true) Integer vendorId

			,
			@ApiParam(value = "product category", required = true) @RequestParam(value = "categoryId", required = true) Integer categoryId

	);

}
