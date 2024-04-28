package day5demo.objects;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] marks = {34,32,45,67,89};
		for(int i=0;i<marks.length;i++)
		{
		System.out.println(marks[i]);
		
		}
		
		System.out.println("##########");
		for(int a:marks) {
			System.out.println(a);
		}
	}

}
