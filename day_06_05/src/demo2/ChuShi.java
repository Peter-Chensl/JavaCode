package demo2;

public class ChuShi extends Employee implements VIP {

	public ChuShi() {
		// TODO Auto-generated constructor stub
	}
	public ChuShi(String name , String id) {
		super(name,id);
	}
	@Override
	public void services() {
		// TODO Auto-generated method stub
		System.out.println("厨师做菜加量");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("初始在炒菜");
	}

}
