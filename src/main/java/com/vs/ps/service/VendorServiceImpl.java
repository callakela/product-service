package com.vs.ps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vs.ps.dao.VendorDAO;
import com.vs.ps.model.Vendor;

@Service("vendorService")
@Transactional
public class VendorServiceImpl implements VendorService{
	@Autowired
	VendorDAO vendorDAO;
	
	@Override
	public void create(Vendor vendor) {
		vendorDAO.create(vendor);
		
	}

	@Override
	public List<Vendor> getAllVendorList() {
		return vendorDAO.getAllVendorList();
	}

}
