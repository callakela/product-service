package com.vs.ps.dao;

import java.util.List;

import com.vs.ps.model.Vendor;

public interface VendorDAO {

	void create(Vendor vendor);

	List<Vendor> getAllVendorList();
}
