package demo;

public class Employee {
	//构造
	public Employee() {
		
	}
	public Employee(String name,int month) {
		super();
		this.month = month;
		this.name = name;
	}
	//属性
	private String name;
	private int month;
	//方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary(int month) {
		return 0;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
}
