package demo1;

public class TestPrson {
	public static void main(String[] args) {
		/*Person p = new Person();
		operatorPerson(p);
		
		operatorPerson(new Person());
	}
	
	public static void operatorPerson(Person p) {
		p.eat();
		p.run();*/
		GetPerson get = new GetPerson();
		Person p = get.get();
		p.run();
		
	}
}
