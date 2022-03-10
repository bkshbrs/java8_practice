package com.java8streamapi.employee;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	//to retrive the employee whose salary>500000 eligible for tax
	public static List<Employee> evaluateTaxUsers(String input) {
		return (input.equalsIgnoreCase("tax"))
				? EmployeeData.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				: EmployeeData.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
						.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("tax"));
	}
}
