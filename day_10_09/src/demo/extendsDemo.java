package demo;

public class extendsDemo {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.i = 10;
		System.out.println("父类：");
		a.showi();
		b.i = 20;
		b.k = 30;
		System.out.println("子类：");
		b.show();
		System.out.println("子类中数据求和：");
		b.sum();
	}
}
class A{
	int i;
	void showi() {
		System.out.println("i:"+i);
	}
}
class B extends A{
	int k;
	void show()
	{
		System.out.println("k:" + k);
	}
	void sum()
	{
		System.out.println("i+k:"+(i+k));
	}
}
