package demo1;

public class Tiger extends Animal {
	
	public Tiger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tiger(String nickName, int age) {
		super(nickName, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println(super.getNickName() + "ÕıÔÚĞ¦£¡");
	}
}
