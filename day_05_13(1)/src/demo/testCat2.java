package demo;
//��������������Ϊ�������д���
public class testCat2 {
	public void info(Cat c) {
		System.out.println("info�еĽ��");
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.size);
		System.out.println(c.strain);
		
		c.color = "��ɫ";
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
		
		System.out.println("main�����еĽ��");
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.size);
		System.out.println(c.strain);
	}
}
