package com.abstrac.example;

public class Emp1 extends EmployeeDetails implements Emp2 {
	
	public void empId() {
		System.out.println("Employee id is 123");
		
	}
	
	public void empSalary() {
		
		System.out.println("employee salary is 10LpA");
	}
	
	public static void main(String[] args) {
		
		Emp1 e1=new Emp1();
		e1.empName();
		e1.empId();
		e1.empSalary();
		
	}

}
