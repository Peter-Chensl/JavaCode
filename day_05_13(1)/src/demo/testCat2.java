package demo;
//引用数据类型作为参数进行传递
public class testCat2 {
	public void info(Cat c) {
		System.out.println("info中的结果");
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.size);
		System.out.println(c.strain);
		
		c.color = "红色";
		c.price = 1000;
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.size);
		System.out.println(c.strain);
		
	}
	public static void main(String[] args) {
		testCat2 t = new testCat2();
		Cat c = new Cat();
		t.info(c);
		
		System.out.println("main方法中的结果");
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.size);
		System.out.println(c.strain);
	}
}
