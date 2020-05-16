package day_05_15;

public class Cat extends Pet {
	public Cat() {
		
	}
	public Cat(String strain) {
		this.strain = strain;
	}
	public Cat(String name,String color,String strain) {
		this.color = color;
		this.name = name;
		this.strain = strain;
	}
	
	String strain;

}
