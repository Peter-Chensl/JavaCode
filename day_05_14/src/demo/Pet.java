package demo;

public class Pet {
	public Pet() {
		System.out.println("ִ�и����޲ι��췽��");
	}
	public Pet(String name,String color) {
		this.name = name;
		this.color = color;
		System.out.println("ִ�и�����ι��췽��");
	}
	String name;
	String color;
	
	public void print() {
		System.out.println("name" + name);
		System.out.println("color" + color);
	}
}
