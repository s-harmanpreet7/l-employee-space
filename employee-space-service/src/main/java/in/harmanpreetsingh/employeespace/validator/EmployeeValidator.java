package in.harmanpreetsingh.employeespace.validator;

import in.harmanpreetsingh.employeespace.model.Employee;

public class EmployeeValidator {

	public static boolean isValidEmployeeInfo(Employee employee) {
		return isValidName(employee.getName()) 
				&& isValidPhone(employee.getPhone())
				&& isValidEmail(employee.getEmail());
	}

	private static boolean isValidName(String name) {
		return name.matches("^[a-zA-z ]*$");
	}

	private static boolean isValidPhone(String phone) {
		return phone.matches("^[0-9]{10}$");
	}

	private static boolean isValidEmail(String email) {
		return email.matches("^(.+)@(.+)$");
	}

}
