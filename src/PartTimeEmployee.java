package exercise4;

public class PartTimeEmployee extends Employee {
	private double hourlyCompensation;

	public PartTimeEmployee(String name, String taxId, double hourlyCompensation) {
		super(name, taxId); //super(hours, name, taxId);
		this.hourlyCompensation = hourlyCompensation;
	}
	
	public double calculateSalary() {
		double salary = hourlyCompensation * getHours();
		if(salary < 500) {
			return (salary * 1.20);
		}
		return salary;
	}
	
	public void printPayrollReport() {
		System.out.println("PAYMENT RECORD FOR A PART TIME EMPLOYEE");
		super.printPayrollReport();
		System.out.println("Remarks" + "\n" + "Hourly Wage: " + hourlyCompensation + " Euro" + "\n");
	}
	
	
}
