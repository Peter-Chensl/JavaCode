package demo;

public class Pet {
	public Pet() {
		System.out.println("执行父类无参构造方法");
	}
	public Pet(String name,String color) {
		this.name = name;
		this.color = color;
		System.out.println("执行父类带参构造方法");
	}
	String name;
	String color;
	
	public void print() {
		System.out.println("name" + name);
		System.out.println("color" + color);
	}
}
