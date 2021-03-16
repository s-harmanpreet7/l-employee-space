package in.harmanpreetsingh.employeespace.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.harmanpreetsingh.employeespace.exception.InvalidDataException;
import in.harmanpreetsingh.employeespace.model.Employee;
import in.harmanpreetsingh.employeespace.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
	private final EmployeeService employeeService;
	
	public EmployeeResource(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		
		try {
			return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
		} catch (InvalidDataException ex) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
}
