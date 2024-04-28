package Exception;

public class ThrowsDemo {

	public static void main(String[] args) {
		System.out.println("main starts");
		ThrowsDemo throwsDemo = new ThrowsDemo();
		try {
			int result = throwsDemo.division(20,0);
			System.out.println("result :"+result);
			
		}
		catch (ArithmeticException e) {
			System.out.println("denominator should not be zero");	
		}
		
		System.out.println("main ends....");
		
	}
int division (int a, int b) throws ArithmeticException {
	int c = a/b;
	return c;
	
}
}
