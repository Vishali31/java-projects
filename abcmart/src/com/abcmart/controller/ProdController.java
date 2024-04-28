package com.abcmart.controller;

import java.util.List;

import com.abcmart.dto.Product;
import com.abcmart.service.ProdService;

public class ProdController {
	public void showProducts() {

		ProdService prodService = new ProdService();
		List<Product> products = prodService.fetchAllProducts();

		System.out.println("ID" + "  " + "NAME" + "  " + "PRICE" + "  " + "CATEGORY");
		System.out.println("----------------------------------------------------------------\n");
		products.forEach(p -> System.out.println(
				p.getProductId() + "  " + p.getProductName() + "  " + p.getProductPrice() + "  " + p.getCategory()));
		System.out.println("\n----------------------------------------------------------------");		
	}
}
