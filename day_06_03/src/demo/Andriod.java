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
		System.out.println("Ա������Ϊ " + getName() + "������Ϊ" + getAge() + "��Ա�����з��Ա��ֻ������");
	}
}
