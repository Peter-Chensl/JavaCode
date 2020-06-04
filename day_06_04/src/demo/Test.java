package demo;

public class Test {
	public static void main(String[] args) {
		CXF c = new CXF(2.0, 6.5);
		double area = c.area(2.0, 3.0);
		System.out.println(area);
	}
}
