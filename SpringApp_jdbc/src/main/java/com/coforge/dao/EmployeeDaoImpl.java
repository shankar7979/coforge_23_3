package com.coforge.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coforge.model.Employee;

import lombok.Data;

@Data
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	JdbcTemplate template;

	@Override
	public List<Employee> getAllEmployee() {
		return null;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		int r = template.update("insert into employee values(" + employee.getId() + ",'" + employee.getName() + "',"
				+ employee.getSalary() + ")");
		if (r == 1)
			return employee;
		return null;
	}
}
