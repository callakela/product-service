package com.vs.ps.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.vs.ps.dao.VendorDAO;
import com.vs.ps.model.Vendor;

@Controller
public class VendorListApiController implements VendorListApi {

	@Autowired
	private VendorDAO vendorDAO;

	public ResponseEntity<List<Vendor>> vendorListGet() {
		return new ResponseEntity<List<Vendor>>(vendorDAO.getAllVendorList(),
				HttpStatus.OK);
	}

}
