package com.main;

import java.util.List;

import com.main.Order.OrderEnum;

public class MainOrder {

	
		public static void main(String[] args) {
	        String paragraph = "this is a sample paragraph with some repeated words and unique words";
	        Order extractor = new Order(OrderEnum.ALPHABETIC_ASCENDING);
	        List<String> uniqueWords = extractor.extractUniqueWords(paragraph);
	        System.out.println(uniqueWords);
	    }
	}

