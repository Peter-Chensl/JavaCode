package demo;

public class Hardware extends Maintainer {

	public Hardware() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Hardware(String name , int age) {
		super(name,age);
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Ա������Ϊ " + getName() + "������Ϊ" + getAge() + "��Ա�������޸���ӡ��");
	}

}
