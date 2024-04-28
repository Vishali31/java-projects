package com.main;

import java.util.List;
import java.util.Scanner;

public class AlphabetCheckerMain {
	static Scanner sc = new Scanner(System.in);

	public String checkAlphabets(List<String> strings) {
		if (strings.isEmpty()) {
			return "Give proper input not empty list";
		}
		boolean allAlphabets = strings.stream().allMatch(s -> s.chars().allMatch(Character::isLetter));

		if (allAlphabets) {
			return "Given list contains only alphabet strings";
		} else {
			return "Given list contains non-alphabet strings";
		}
	}

	public static void main(String[] args) {
		AlphabetCheckerMain checker = new AlphabetCheckerMain();
		System.out.println("Enter a String :");
		String word = sc.nextLine();
		String[] splittedWord = word.splitWithDelimiters(" ", 0);
		

		List<String> input3 = List.of(splittedWord);
		System.out.println("Output For: " + word);
		System.out.println(checker.checkAlphabets(input3));

	}
}
