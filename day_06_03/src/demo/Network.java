package demo;

public class Network extends Maintainer {
	public Network() {
		// TODO Auto-generated constructor stub
	}
	public Network(String name , int age){
		super(name,age);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
        System.out.println("员工姓名为 " + getName() + "的年龄为" + getAge() + "的员工正在检查网络是否通畅");
	}

}
