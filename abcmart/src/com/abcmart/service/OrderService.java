package com.abcmart.service;

import com.abcmart.dao.ProductDao;
import com.abcmart.dto.Product;

public class OrderService {
	public double placeOrder(int productId, int quantity) {
		ProductDao productDao = new ProductDao();
		Product product = productDao.findproduct(productId);

		int productPrice = product.getProductPrice();
		int total = productPrice * quantity;

		double gst = total * 0.05;
		return (total + gst);

	}

}
