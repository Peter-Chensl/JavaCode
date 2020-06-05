package demo2;

public class Jinli extends Employee {
	double money;
	
	public Jinli() {
		
	}

	public Jinli(String name, String id, double money) {
		super(name, id);
		this.money = money;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("管理员工");
	}

}
