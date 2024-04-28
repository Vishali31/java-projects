package com.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonStreamOperations {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Operations operations = new Operations();

		String[] personNames = { "Kamala", "Priyanka", "Gautham", "Moses" };
		List<String> sortedNames = operations.getPersonListSortedByNameInUpperCase(personNames);
		System.out.println("Sorted person list in uppercase: ");
		for (String i : sortedNames) {
			System.out.println(i);
		}

		System.out.println("--------------------------------------------");

		String[] personName2 = { "Kamala", "Priyanka", "Moses", "Kamala", "Gautham" };
		List<String> names = List.of(personName2);
		Set<String> sortedNames1 = operations.getDistinctPersonNamesSortedInDescendingOrder(names);
		System.out.println("Sorted person Name list in DescendingOrder: ");
		for (String i : sortedNames1) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------------");

		String[] personNames4 = { "Kamala", "Priyanka", "Gautham", "Moses" };
		String nameToSearch = "Gautham";
		String result = operations.searchPerson(personNames4, nameToSearch);
		System.out.println(result);

		System.out.println("--------------------------------------------");
		String[] personNames5 = { "Kamala", "Priyanka", "Gautham", "Moses" };
		List<String> sortedNames5 = operations.getPersonListSortedByLengthWithNameLengthGreaterThanFive(personNames5);
		System.out.println("Sorted person list in Name Length Greater Than Five: ");
		for (String i : sortedNames5) {
			System.out.println(i);
		}

		System.out.println("--------------------------------------------");
		Map<String, Integer> personNames6 = new HashMap<>();
		personNames6.put("Gautham", 30);
		personNames6.put("Latha", 56);
		personNames6.put("Punith", 45);
		String result6 = operations.getPersonByMaxAge(personNames6);
		System.out.println(result6);

		scanner.close();

	}

}
