package demo;

interface animal{
	public static void eat()
	{
		
	}
}
interface dog{
	public static void sleep() {
		
	}
	
}
class dog1 implements animal,dog{
	public void eat() {
		System.out.println("Сè�ڳ�è����");

	}
	public void sleep() {
		System.out.println("Сè��˯����");

	}
}
public class cat{
	public static void main(String[] args) {
		dog1 d = new dog1();
		d.eat();
		d.sleep();
	}
}

