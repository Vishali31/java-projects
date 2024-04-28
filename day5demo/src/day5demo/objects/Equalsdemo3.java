package day5demo.objects;

public class Equalsdemo3 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(10,"raj",560000);
		Employee emp2 = new Employee(20,"krish",560000);
		Employee emp3 = new Employee(10,"raj",560000);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		if(emp1.equals(emp2)) {
			System.out.println("equals");
			
		}
		else {
			System.out.println("not equals");
		}
	}
	
}
