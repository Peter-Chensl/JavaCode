package day_05_15;

public class Pet {
	public Pet() {
		
	}
	public Pet(String name,String color) {
		this.color = color;
		this.name = name;
	}
	String name;
	String color;
	
	public void print() {
		System.out.println("name:" + name);
		System.out.println("color:" + color);
	}
}
