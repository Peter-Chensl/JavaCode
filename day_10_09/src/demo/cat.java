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
		System.out.println("小猫在吃猫粮！");

	}
	public void sleep() {
		System.out.println("小猫在睡觉！");

	}
}
public class cat{
	public static void main(String[] args) {
		dog1 d = new dog1();
		d.eat();
		d.sleep();
	}
}

