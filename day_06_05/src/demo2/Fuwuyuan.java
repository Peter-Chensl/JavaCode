package demo2;

public class Fuwuyuan extends Employee implements VIP {

	
	public Fuwuyuan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fuwuyuan(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void services() {
		// TODO Auto-generated method stub
		System.out.println("服务员给顾客倒酒");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("服务员在上菜");
	}

}
