package com.abcmart.controller;

import com.abcmart.service.OrderService;

public class OrderController {

	public String buyProduct(int productId, int quantity) {

		OrderService orderService = new OrderService();
		double finalPrice = orderService.placeOrder(productId, quantity);
		return "Your order placed successfully. Final price -> " + finalPrice;
	}

}
