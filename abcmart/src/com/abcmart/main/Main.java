package com.abcmart.main;

import java.util.Scanner;

import com.abcmart.controller.OrderController;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter productId :");
		int productId = sc.nextInt();
		System.out.println("Enter quantity :");
		int qty = sc.nextInt();

		OrderController orderController = new OrderController();
		String result = orderController.buyProduct(productId, qty);
		System.out.println(result);
		sc.close();

	}

}
