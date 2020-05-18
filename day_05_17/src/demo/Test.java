package demo;

public class Test {
	public static void main(String[] args) {
		Circle c = new Circle();
		double w = 121.709;
		c.setRadius(w);
		System.out.println("圆的半径：" + c.getRadius());
		System.out.println("圆的面积：" + c.getArea());
		System.out.println("更改向方法参数radius传递值的w为100");
		w = 100;
		System.out.println("w = " + w);
		System.out.println("圆的半径：" + c.getRadius());
	}
}
