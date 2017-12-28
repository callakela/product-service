package com.vs.ps.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vs.ps.model.ProductCategory;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Api(value = "productCategory", description = "the productCategory API")
public interface ProductCategoryApi {

	@ApiOperation(value = "Product Category", notes = "Get Product Categories", response = ProductCategory.class, responseContainer = "List", tags = { "Product", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An array of product categories", response = ProductCategory.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = ProductCategory.class) })
	@RequestMapping(value = "/productCategory", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<ProductCategory>> productCategoryGet();

}
