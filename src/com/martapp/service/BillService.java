package com.martapp.service;

import com.martapp.model.*;

import java.util.List;


public interface BillService {
	// comment
	void addBill(Bill b);
//	void deleteBill(int id);
//	void updateCashier(Cashier c);
	List<Bill> searchBills(String searchData);
	List<Bill> getAllBills();
}
