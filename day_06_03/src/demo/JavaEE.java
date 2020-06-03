package demo;

public class JavaEE extends Developer {
	public JavaEE() {
		super();
	}

	public JavaEE(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("员工姓名为" + getName() + "的" + getAge() + "正在开发淘宝网战");
	}

}
