package com.vs.ps.api;

import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.vs.ps.dao.VendorDAO;
import com.vs.ps.model.Vendor;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Controller
public class CreateVendorApiController implements CreateVendorApi {

	@Autowired
	private VendorDAO vendorDAO;

	public ResponseEntity<Integer> createVendorPut(
			@ApiParam(value = "Create Vendor with Name", required = true) @RequestParam(value = "vendorName", required = true) String vendorName) {

		Vendor vendor = new Vendor();
		vendor.setName(vendorName);

		vendorDAO.create(vendor);
		return new ResponseEntity<Integer>(vendor.getId(), HttpStatus.OK);
	}

}
