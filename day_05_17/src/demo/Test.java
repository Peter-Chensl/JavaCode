package demo;

public class Test {
	public static void main(String[] args) {
		Circle c = new Circle();
		double w = 121.709;
		c.setRadius(w);
		System.out.println("Բ�İ뾶��" + c.getRadius());
		System.out.println("Բ�������" + c.getArea());
		System.out.println("�����򷽷�����radius����ֵ��wΪ100");
		w = 100;
		System.out.println("w = " + w);
		System.out.println("Բ�İ뾶��" + c.getRadius());
	}
}
