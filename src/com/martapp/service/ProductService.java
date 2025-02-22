package com.martapp.service;

import com.martapp.model.*;
import java.util.List;

public interface ProductService {
	void addProduct(Product p);
	void deleteProduct(int id);
	void updateProduct(Product p);
	List<Product> searchProduct(String searchData);
	List<Product> getAllProducts();
}
