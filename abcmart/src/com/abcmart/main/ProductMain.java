package com.abcmart.main;

import com.abcmart.controller.ProdController;

public class ProductMain {

	public static void main(String[] args) {

		ProdController prodController = new ProdController();
		prodController.showProducts();
	}

}
