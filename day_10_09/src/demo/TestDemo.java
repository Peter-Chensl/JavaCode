package demo;

class Animal{
	void eat(){
		System.out.println("动物在吃......!");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("小狗在吃狗粮！");
	}
	void eatTest() {
		super.eat();
		this.eat();
	}
}
public class TestDemo {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		d.eatTest();
	}
}
