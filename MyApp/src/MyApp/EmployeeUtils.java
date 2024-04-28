package MyApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeUtils {

	static String generateEmployeeId(String fName, String sName, LocalDate birthDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMYY");
		String id = null;
		id = sName.substring(0, 3) + fName.substring(0, 2) + formatter.format(birthDate);

		return id;

	}

}
