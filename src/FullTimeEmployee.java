package exercise4;

public class FullTimeEmployee extends Employee {
	private int monthlySalary;

	public FullTimeEmployee(String name, String taxId, int monthlySalary) {
		super(name, taxId); //super(hours, name, taxId);
		this.monthlySalary = monthlySalary;
	}
	
	public double calculateSalary() {
		return monthlySalary + (getHours() * 0.005 * monthlySalary);
	}
	public void printPayrollReport() {
		System.out.println("PAYMENT RECORD FOR A FULL TIME EMPLOYEE");
		super.printPayrollReport();
		System.out.println("Remarks" + "\n" + "Work Hours refer to overtime work " + "\n" + "Monthly Salary: " + monthlySalary + "\n");
	}
}
