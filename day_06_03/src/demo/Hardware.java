package demo;

public class Hardware extends Maintainer {

	public Hardware() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Hardware(String name , int age) {
		super(name,age);
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("员工姓名为 " + getName() + "的年龄为" + getAge() + "的员工正在修复打印机");
	}

}
