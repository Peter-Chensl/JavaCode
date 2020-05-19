package demo;

public class Dog extends Pet{
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, String color, String strain) {
		super(name, color);
		this.strain = strain;
	}

	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.getName() + "ÕıÔÚ³Ô¹·Äï");
	}
}
