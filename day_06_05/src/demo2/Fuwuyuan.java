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
		System.out.println("����Ա���˿͵���");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("����Ա���ϲ�");
	}

}
