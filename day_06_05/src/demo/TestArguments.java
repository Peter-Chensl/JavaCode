package demo;
//��������Ϊ�����Ĳ���
public class TestArguments {
	public static void main(String[] args) {
		Cat c = new Cat();
		operator(c);
	}
	
	public static void operator(Animal a) {
		a.eat();
	}
}
