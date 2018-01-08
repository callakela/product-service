package com.vs.ps.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.vs.ps.model.Vendor;
import com.vs.ps.service.VendorService;

@Controller
public class VendorListApiController implements VendorListApi {

	@Autowired
	private VendorService vendorService;

	public ResponseEntity<List<Vendor>> vendorListGet() {
		return new ResponseEntity<List<Vendor>>(vendorService.getAllVendorList(),
				HttpStatus.OK);
	}

}
