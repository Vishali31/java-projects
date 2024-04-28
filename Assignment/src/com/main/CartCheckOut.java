package com.main;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CartCheckOut {
	
	
	    public String billGenerator(Map<String, Double> cart, Double taxPercent) {
	        // Check if the cart is empty or taxPercent is null
	        if (cart == null || cart.isEmpty()) {
	            return "The cart Map is empty";
	        }
	        if (taxPercent == null) {
	            return "The taxPercent cannot be null";
	        }

	        // Check if taxPercent is negative
	        if (taxPercent < 0) {
	            return "The taxPercent cannot be negative";
	        }

	        // Check if any item in the cart has null or zero value
	        for (Double value : cart.values()) {
	            if (value == null) {
	                return "Cart contains invalid values";
	            }
	        }

	        // Calculate total cost including taxes
	        double totalCost = 0.0;
	        for (Double price : cart.values()) {
	            totalCost = totalCost + (price+((price)*(Double.valueOf(taxPercent / 100))));
	        }

	        return totalCost+"";
	    }
}


	


