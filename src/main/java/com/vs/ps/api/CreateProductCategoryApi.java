package com.vs.ps.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "createProductCategory", description = "the createProductCategory API")
public interface CreateProductCategoryApi {

	@ApiOperation(value = "Create Category", notes = "Create Category", response = Integer.class, tags = { "Product", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Category Created", response = Integer.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Integer.class) })
	@RequestMapping(value = "/createProductCategory", produces = { "application/json" }, method = RequestMethod.PUT)
	ResponseEntity<Integer> createProductCategoryPut(
			@ApiParam(value = "Create category", required = true) @RequestParam(value = "category", required = true) String category

	);

}
