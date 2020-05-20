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


	//属性
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

	//方法
	public void cry() {
		System.out.println("动物正在叫。。。。");
		
	}
	public void print() {
		System.out.println("昵称：" + getNickName());
		System.out.println("年龄：" + getAge());
	}

}
