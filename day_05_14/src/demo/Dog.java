package demo;

public class Dog  extends Pet{
	/*public Dog() {
		System.out.println("执行Dog类无参构造方法");
	}
	public Dog(String strain,double size) {
		this.strain = strain;
		this.size = size;
		System.out.println("执行Dog类带两个参数的万构造方法");
	}
	public Dog(String name,String color,String strain,double size) {
		this.color = color;
		this.name = name;
		this.size = size;
		this.strain = strain;
		System.out.println("执行Dog类带四个参数的构造方法");
	}*/
	public Dog() {
		//super();//指明调用父类的无参构造方法
		super("琪琪","白色");//指明调用父类的带参构造方法
		System.out.println("执行Dog类无参构造方法");
	}
	public Dog(String strain,double size) {
		this.strain = strain;
		this.size = size;
		System.out.println("执行Dog类带两个参数的万构造方法");
	}
	public Dog(String name,String color,String strain,double size) {
		this.color = color;
		this.name = name;
		this.size = size;
		this.strain = strain;
		System.out.println("执行Dog类带四个参数的构造方法");
	}
	String strain;
	double size;
}
