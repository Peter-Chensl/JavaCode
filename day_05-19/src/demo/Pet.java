package demo;

public class Pet {
	public Pet() {
		// TODO Auto-generated constructor stub
	}
	//属性
	public Pet(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	private String name;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//方法
	public void eat() {
		System.out.println("宠物正在吃");
	}
}
