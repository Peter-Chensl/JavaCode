package demo;

public class Test {
	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee("����",5,1000);
		System.out.println("н��Ϊ" + se.getSalary(6));
		
		HourlyEmployee ho = new HourlyEmployee("�����",6,1,1000);
		System.out.println("н��Ϊ" + ho.getSalary(6));
		
		SaleEmpolyee sa = new SaleEmpolyee("����",6,5000,0.8);
		System.out.println("н��Ϊ" + sa.getSalary(6));
		
		BasePlusSalesEmployee ba = new BasePlusSalesEmployee("����",6,500,0.1,35000);
		System.out.println("н��Ϊ" + ba.getSalary(6));
	}
}
