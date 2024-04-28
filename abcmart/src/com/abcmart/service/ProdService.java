package com.abcmart.service;

import java.util.List;

import com.abcmart.dao.ProductDao;
import com.abcmart.dto.Product;

public class ProdService {
	public List<Product> fetchAllProducts() {
		ProductDao productDao = new ProductDao();
		List<Product> products = productDao.listProducts();
		return products;

	}
}
