package com.vs.ps.service;

import java.util.List;

import com.vs.ps.model.Vendor;

public interface VendorService {
	void create(Vendor vendor);

	List<Vendor> getAllVendorList();
}
