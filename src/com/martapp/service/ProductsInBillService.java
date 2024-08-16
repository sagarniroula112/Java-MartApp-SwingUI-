package com.martapp.service;

import java.util.List;

import com.martapp.model.ProductsInBill;

public interface ProductsInBillService {
	void addProduct(ProductsInBill p);
	void deleteProduct(String name);
	List<ProductsInBill> getAllProducts();
	void removeAllProductsInBill();
	void updateProductQuantity(String name, int quantity);
	int getProductQuantityAvailable(String name);
}
