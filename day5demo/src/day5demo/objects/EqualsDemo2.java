package day5demo.objects;

public class EqualsDemo2 {

	public static void main(String[] args) {
		X x1 = new X(10);
		X x2 = new X(10);
		 
		if(x1.equals(x2)) {
			System.out.println("equals");
			
		}
		else {
			System.out.println("not equals");
		}

	}

}
class X {
	int i ;
	X (int i){
	
		this.i = i;
	}
}

	
