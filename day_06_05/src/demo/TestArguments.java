package demo;
//抽象类作为方法的参数
public class TestArguments {
	public static void main(String[] args) {
		Cat c = new Cat();
		operator(c);
	}
	
	public static void operator(Animal a) {
		a.eat();
	}
}
