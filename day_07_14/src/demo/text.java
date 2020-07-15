package demo;

import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入矩形的宽：");
		double wide = input.nextDouble();
		System.out.println("请输入矩形的长：");
		double height = input.nextDouble();
		Rectange r = new Rectange(wide, height);
		r.area();
		r.zhouchang();
		
		System.out.println("请输入正六边形的周长");
		double lenth = input.nextDouble();
		Hexagon h = new Hexagon(lenth);
		h.area();
		h.zhouchang();
		
		System.out.println("请输入圆形的半径：");
		double ridius = input.nextDouble();
		Circular c = new Circular(ridius);
		c.area();
		c.zhouchang();
		
		System.out.println("请输入椭圆的两个半轴长");
		double lhalfshaft = input.nextDouble();
		double shalfshaft = input.nextDouble();
		Ellipse e = new Ellipse(lhalfshaft, shalfshaft);
		e.area();
		e.zhouchang();
		
		System.out.println("请输入正方形的边长");
		double slenth = input.nextDouble();
		Square s = new Square(slenth);
		s.area();
		s.zhouchang();
	}
}
