package demo;

class Animal{
	void eat(){
		System.out.println("�����ڳ�......!");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("С���ڳԹ�����");
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
