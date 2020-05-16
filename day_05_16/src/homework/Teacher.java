package homework;

public class Teacher extends People {
	public Teacher() {
		
	}
	
	public Teacher(String name, Gender sex, int age, double salary) {
		super(name, sex, age);
		this.salary = salary;
	}

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void teach() {
		System.out.println(super.getName() + "正在教学");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("salary:" + salary);
	}
}
