package demo;

public class Penguin extends Pet {
	public Penguin() {
		// TODO Auto-generated constructor stub
	}
	
	private Gender sex;

	public Penguin(String name, String color, Gender sex) {
		super(name, color);
		this.sex = sex;
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.getName() + "ÕıÔÚ³ÔÓã");
	}
	
}
