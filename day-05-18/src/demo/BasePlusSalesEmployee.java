package demo;

public class BasePlusSalesEmployee extends SaleEmpolyee {
	public BasePlusSalesEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	private double baseSalary;

	public BasePlusSalesEmployee(String name, int month, double sales, double commission, double baseSalary) {
		super(name, month, sales, commission);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		double money = this.baseSalary + this.getSales() * super.getCommission();
		if(super.getMonth() == month) {
			money += 100;
		}
		return money;
	}
}
