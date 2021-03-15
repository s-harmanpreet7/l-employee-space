package in.harmanpreetsingh.employeespace.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.harmanpreetsingh.employeespace.model.Employee;
import in.harmanpreetsingh.employeespace.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	private final EmployeeRepository employeeRepo;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeId(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}
}
