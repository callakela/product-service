package com.vs.ps.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vs.ps.model.Vendor;

@Api(value = "vendorList", description = "the vendorList API")
public interface VendorListApi {

	@ApiOperation(value = "Get List Of all available Vendors", notes = "Get List Of all available Vendors", response = Vendor.class, tags = { "Product", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "A list of all available vendors", response = Vendor.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Vendor.class) })
	@RequestMapping(value = "/vendorList", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<Vendor>> vendorListGet();

}
