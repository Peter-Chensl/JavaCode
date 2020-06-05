package demo;

public class TestReturn {
	public static void main(String[] args) {
		GetAnimal g = new GetAnimal();
		
		Animal a = g.getAnimal();
		a.eat();
	}
}
