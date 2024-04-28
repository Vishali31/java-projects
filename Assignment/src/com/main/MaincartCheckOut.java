package com.main;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaincartCheckOut {

	public static void main(String[] args) {

		CartCheckOut cartCheckout = new CartCheckOut();
		Scanner scanner = new Scanner(System.in);

		// Get cart items from user input
		Map<String, Double> cart = new HashMap<String, Double>();
		
		cart.put("Apple",54.0);
		cart.put("Grapes",36.78);
		cart.put("Papaya",27.89);
		cart.put("Banana",10.2);
		cart.put("Orange",23.6);
		
		

		// Get tax percentage from user input
		System.out.print("Enter tax percentage: ");
		Double taxPercent = scanner.nextDouble();

		// Calculate and print the total cost
		String totalCost = cartCheckout.billGenerator(cart, taxPercent);
		System.out.println("Total cost including taxes: " + totalCost);

		// Close scanner
		scanner.close();

	}

}
