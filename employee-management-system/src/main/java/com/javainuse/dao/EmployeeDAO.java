package com.javainuse.dao;

import java.util.ArrayList;
import java.util.List;

import com.javainuse.domain.Depatment;
import com.javainuse.domain.Employee;

public class EmployeeDAO {
	
	private static final String name = null;

	private Depatment depatment = new Depatment (name+"java");

	private List<Employee> testEmployees = new ArrayList<Employee>();

	public void addNewEmployee(Employee employee) {
		testEmployees.add(employee);
	}

	public List<Employee> getAllEmployees(){ 
		return new ArrayList<Employee>(testEmployees);
	}
	
	public Depatment getDepartment() {
		return this.depatment;
	}

}