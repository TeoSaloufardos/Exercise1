package exercise4;

public abstract class Employee {
	private int hours = 0;
	private String name;
	private String taxId;
	
	public Employee (String name,String taxId){
		//this.hours = 0;
		this.name = name;
		this.taxId = taxId;
	}

	public String getName() {
		return name;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getHours() {
		return hours;
	}
	
	public abstract double calculateSalary();
	
	public void printPayrollReport() {
		System.out.println("Employee's Last Name: " + name + "\n" + "Tax ID Number: " + taxId + "\n" + "Hours: " + hours + "\n" + "Montly Total: " + calculateSalary() + " Euro");
	}
}
