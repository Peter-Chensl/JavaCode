package demo;

public class Andriod extends Developer {

	public Andriod() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Andriod(String name, int age){
		super(name,age);
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("员工姓名为 " + getName() + "的年龄为" + getAge() + "的员工在研发淘宝手机端软件");
	}
}
