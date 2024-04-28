package com.main;

import java.util.Scanner;

public class CharacterPosition {
	

	public static void main(String[] args) {
		CharacterPosition characterPosition = new CharacterPosition();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter string:");
		String inputString = scanner.nextLine();

		System.out.println("Enter the position:");
		String positionString = scanner.nextLine();

		char output = characterPosition.charPositionIdentifier(inputString, positionString);
		System.out.println("Output: " + output);

		scanner.close();
	}
	
	public char charPositionIdentifier(String inputString, String positionString) {
		try {
			int position = Integer.parseInt(positionString);
			return inputString.charAt(position);
		} catch (NumberFormatException e) {
			System.out.println("Position should be a positive number");
			return ' ';
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("You have entered wrong position");
			return ' ';
		}
	}
}