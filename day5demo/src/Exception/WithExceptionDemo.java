package Exception;

	

public class WithExceptionDemo {

	public static void main(String[] args) {
		System.out.println("main starts......");
		int a = 10;
		int b = 5;
	try {
		
	
	int c = a/b;
		System.out.println("result = "+c);
	}
	catch (ArithmeticException e) {
		System.out.println("DENOMINATOR SHOLU NOT BE ZERO.");
	}
	System.out.println("main ends......");	

	}

}
 