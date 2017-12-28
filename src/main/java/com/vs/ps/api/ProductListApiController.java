package com.vs.ps.api;

import io.swagger.annotations.ApiParam;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.vs.ps.model.Product;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Controller
public class ProductListApiController implements ProductListApi {

	public ResponseEntity<List<Product>> productListGet(
			@ApiParam(value = "vendor id", required = true) @RequestParam(value = "vendorId", required = true) Integer vendorId

			,
			@ApiParam(value = "product category", required = true) @RequestParam(value = "categoryId", required = true) Integer categoryId

	) {
		// do some magic!
		return new ResponseEntity<List<Product>>(HttpStatus.OK);
	}

}
