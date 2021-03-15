package in.harmanpreetsingh.employeespace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.harmanpreetsingh.employeespace.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
