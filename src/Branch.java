package exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
	private String address;
	private ArrayList<Employee> employees = new ArrayList<>();
	
	public Branch(String address) {
		this.address = address;
	} 	
	
	public void addEmployee(Employee employee) {
		if(employees.size() < 100) {
			employees.add(employee);			
		}
		else System.out.println("You can not add more employees");
	}
	
	public void setEmployeeHours(String month) {
		Scanner input = new Scanner(System.in);
		for(Employee employeesOfBranch: employees) {
			System.out.println("Enter the number of hours for employee " + employeesOfBranch.getName());
			int hours = input.nextInt();
			input.nextLine();
			employeesOfBranch.setHours(hours);
		}
	}
	
	public void printPayRoll(String month) {
		System.out.println("********** PAYROLL for DECEMBER **********" + "\n" + "Branch: " + address + "\n" + " " );
		for(Employee employeesOfBranch: employees) {
			employeesOfBranch.printPayrollReport();
		}		
	}
}
