package demo;

public class SaleEmpolyee extends Employee {
	public SaleEmpolyee() {
		// TODO Auto-generated constructor stub
	}
	
	public SaleEmpolyee(String name, int month, double sales, double commission) {
		super(name, month);
		this.sales = sales;
		this.commission = commission;
	}

	private double sales;
	private double commission;
	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		double money = sales * commission;
		if(super.getMonth() == month) {
			money += 100;
		}
		return money;
	}
}
