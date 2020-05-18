package demo;

public class HourlyEmployee extends Employee {
	private void Hourlyemployee() {
		// TODO Auto-generated method stub

	}
	
	public HourlyEmployee(String name, int month, double hourlySalary, double hours) {
		super(name, month);
		this.hourlySalary = hourlySalary;
		this.hours = hours;
	}

	private double hourlySalary;
	private double hours;
	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		double money = hourlySalary * hours;
		if(this.hours > 160) {
			money =hourlySalary * hours * 1.5;
		}
		if(super.getMonth() == month) {
			money += 100;
		}
		return money;
	}
}
