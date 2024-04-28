package com.main;

import java.util.*;

public class Order {
	public enum OrderEnum {
		ALPHABETIC_ASCENDING, ALPHABETIC_DESCENDING, LENGTH_THEN_ALPHABETIC_ASCENDING, INPUT_ORDER
	}

	private OrderEnum order;

	public Order(OrderEnum order) {
		this.order = order;
	}

	public List<String> extractUniqueWords(String paragraph) {
		String[] words = paragraph.split("\\s+");
		Set<String> uniqueWordsSet = new LinkedHashSet<>(Arrays.asList(words));
		List<String> uniqueWordsList = new ArrayList<>(uniqueWordsSet);

		switch (order) {
		case ALPHABETIC_ASCENDING:
			Collections.sort(uniqueWordsList);
			break;
		case ALPHABETIC_DESCENDING:
			Collections.sort(uniqueWordsList, Collections.reverseOrder());
			break;
		case LENGTH_THEN_ALPHABETIC_ASCENDING:
			Collections.sort(uniqueWordsList, Comparator.comparing(String::length).thenComparing(String::compareTo));
			break;
		case INPUT_ORDER:
			uniqueWordsList.retainAll(Arrays.asList(words));
			break;
		}

		return uniqueWordsList;
	}
}
