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
        System.out.println("Ա������Ϊ " + getName() + "������Ϊ" + getAge() + "��Ա�����ڼ�������Ƿ�ͨ��");
	}

}
