package com.simplon.crudwebapp.service;
import java.util.List;

import com.simplon.crudwebapp.model.Employee;



public interface EmployeeService {
	public List<Employee> getAllEmployee();
	public void saveEmployee(Employee employee);
	public Employee getEmployeeById(long id);
	public void deleteEmployeeById(long id);
}
