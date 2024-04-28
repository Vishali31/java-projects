package MyApp;

public class A {
	private static A a1 = new A();
	
	private A() {
		
	}
	static public A getAInstance() {
		return a1;
	}
}
