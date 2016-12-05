package godofjava;

public class SalaryManager {

	int yealySalary;
	double monthlySalary;
	double incomeTax;
	double nationalPension;
	double healthInsurance;
	
	public static void main(String[] args) {
		SalaryManager salaryManager = new SalaryManager();
		salaryManager.getMonthlySalary(20000000);
	}
	
	public double getMonthlySalary(int yearlySalary) {
		double deduction;
		
		this.monthlySalary = yearlySalary / 12.0;
		System.out.println("monthlySalary(before deduction)="+this.monthlySalary);
		calculateTax(this.monthlySalary);
		calculateNationalPension(this.monthlySalary);
		calculateHealthInsurance(this.monthlySalary);
		
		deduction = this.incomeTax + this.nationalPension + this.healthInsurance ;
		System.out.print("deduction="+deduction);
		this.monthlySalary -= deduction;
		System.out.println("monthlySalary(after deduction)="+this.monthlySalary);
		return this.monthlySalary;
	}
	
	public double calculateTax(double monthlySalary) {
		this.incomeTax = monthlySalary * 0.125;
		System.out.println("incomeTax="+ this.incomeTax);
		return this.incomeTax;
	}
	
	public double calculateNationalPension(double monthlySalary) {
		this.nationalPension = monthlySalary * 0.081;
		System.out.println("nationalPension="+ this.nationalPension);
		return this.nationalPension;
	}

	public double calculateHealthInsurance(double monthlySalary) {
		this.healthInsurance = monthlySalary * 0.135;
		System.out.println("healthInsurance="+ this.healthInsurance);
		return this.healthInsurance;
	}
	
}
