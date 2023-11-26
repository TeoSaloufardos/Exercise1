package exercise4;

public class Main {

	public static void main(String[] args) {
		Branch branch1 = new Branch("Thessaloniki");
		PartTimeEmployee partTime1 = new PartTimeEmployee("Nikolaou" , "067832710" , 4);
		FullTimeEmployee fullTime1 = new FullTimeEmployee("Papadopoulos", "067832711", 1300);
		
		branch1.addEmployee(fullTime1);
		branch1.addEmployee(partTime1);
		
		branch1.setEmployeeHours("DECEMBER");
		
		branch1.printPayRoll("DECEMBER");
	}

}
