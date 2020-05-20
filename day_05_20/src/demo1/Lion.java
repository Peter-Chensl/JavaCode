package demo1;

public class Lion extends Animal {
	
	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(String nickName, int age) {
		super(nickName, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println(super.getNickName() + "е§дкНа");
	}
}
