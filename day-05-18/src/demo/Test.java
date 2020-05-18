package demo;

public class Test {
	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee("黎明",5,1000);
		System.out.println("薪资为" + se.getSalary(6));
		
		HourlyEmployee ho = new HourlyEmployee("李洪敏",6,1,1000);
		System.out.println("薪资为" + ho.getSalary(6));
		
		SaleEmpolyee sa = new SaleEmpolyee("刘光",6,5000,0.8);
		System.out.println("薪资为" + sa.getSalary(6));
		
		BasePlusSalesEmployee ba = new BasePlusSalesEmployee("李红河",6,500,0.1,35000);
		System.out.println("薪资为" + ba.getSalary(6));
	}
}
