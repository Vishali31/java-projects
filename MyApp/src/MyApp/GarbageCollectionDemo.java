package MyApp;

public class GarbageCollectionDemo {
	
	protected void finalize() throws Throwable{
		System.out.println("in finalize");
		
	}
	


public static void main(String[] args) {

	System.gc();
}
}