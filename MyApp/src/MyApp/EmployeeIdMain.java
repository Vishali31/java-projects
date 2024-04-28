package MyApp;

import java.time.LocalDate;

public class EmployeeIdMain {

	public static void main(String[] args) {

		String firstName = "john";
		String secondName = "kumar";
		LocalDate dob = LocalDate.of(2003, 5, 31);

		String empId = EmployeeUtils.generateEmployeeId(firstName, secondName, dob);
		System.out.println("YourEmployee id :" + empId);

	}
}
