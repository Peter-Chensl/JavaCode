package demo;
/**
 * ¹Ì¶¨¹¤×Ê
 * */
public class SalariedEmployee extends Employee {
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public SalariedEmployee(String name, int month, double monthlySalary) {
		super(name, month);
		this.monthlySalary = monthlySalary;
	}

	private double monthlySalary;

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		if(this.getMonth() == month) {
			this.monthlySalary += 100;
		}
		return this.monthlySalary;
	}
}
