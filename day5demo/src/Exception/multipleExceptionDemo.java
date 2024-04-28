package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multipleExceptionDemo {

	public static void main(String[] args) {
		System.out.println("main starts......");
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("result = "+c);
		}
		catch (ArithmeticException e) {
			System.out.println("DENOMINATOR SHOLU NOT BE ZERO.");
		}
		catch (InputMismatchException e) {
			System.out.println("pass the crt value");
		}
		System.out.println("Main ends......");
		}
		

	}



