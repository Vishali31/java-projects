package Exception;

public class ThrowsDemo2 {

	public static void main(String[] args) {
		System.out.println("main starts");
		ThrowsDemo throwsDemo = new ThrowsDemo();
		try {
			load();
			}catch (ClassNotFoundException e) {
		
			System.out.println(e.getMessage());	
		}
		System.out.println("main ends..");	
	}

	static void load() throws ClassNotFoundException {
		Class.forName("days5demo.Exceptions.MulticatchDemojjj");
		System.out.println("class loaded..");	
		
	}

}
