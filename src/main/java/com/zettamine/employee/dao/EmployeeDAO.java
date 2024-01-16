package com.zettamine.employee.dao;

import java.util.List;

import com.zettamine.employee.dto.Employee;

public interface EmployeeDAO {
	public Integer saveEmployee(Employee emp);

	public Employee findEmployeeById(Integer id);

	public String getEmployeeNameById(Integer id);

	public List<Employee> getAllEmployees();

}
