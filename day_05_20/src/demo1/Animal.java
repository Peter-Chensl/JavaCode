package demo1;

public class Animal {
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Animal(String nickName, int age) {
		super();
		this.nickName = nickName;
		this.age = age;
	}


	//����
	private String nickName;
	private int age;
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//����
	public void cry() {
		System.out.println("�������ڽС�������");
		
	}
	public void print() {
		System.out.println("�ǳƣ�" + getNickName());
		System.out.println("���䣺" + getAge());
	}

}
