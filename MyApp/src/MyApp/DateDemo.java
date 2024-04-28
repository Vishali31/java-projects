package MyApp;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
	
		LocalDate today = LocalDate.now();
        System.out.println(today);
        
        LocalDateTime todayTime = LocalDateTime.now();
        System.out.println(todayTime);
     
        LocalDate dob = LocalDate.of(2003, 05, 31);
        System.out.println(dob);
        
        LocalDate dateOfPassing = LocalDate.of(2023, 05, 23);
        System.out.println("DateOfPassing"  +dateOfPassing);
     
        LocalDate date= LocalDate.now();
        LocalDate afterDays = today.plusDays(20);
        System.out.println("AfterDays :"  +afterDays);
	}
}
