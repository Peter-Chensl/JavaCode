package demo;

import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������εĿ�");
		double wide = input.nextDouble();
		System.out.println("��������εĳ���");
		double height = input.nextDouble();
		Rectange r = new Rectange(wide, height);
		r.area();
		r.zhouchang();
		
		System.out.println("�������������ε��ܳ�");
		double lenth = input.nextDouble();
		Hexagon h = new Hexagon(lenth);
		h.area();
		h.zhouchang();
		
		System.out.println("������Բ�εİ뾶��");
		double ridius = input.nextDouble();
		Circular c = new Circular(ridius);
		c.area();
		c.zhouchang();
		
		System.out.println("��������Բ���������᳤");
		double lhalfshaft = input.nextDouble();
		double shalfshaft = input.nextDouble();
		Ellipse e = new Ellipse(lhalfshaft, shalfshaft);
		e.area();
		e.zhouchang();
		
		System.out.println("�����������εı߳�");
		double slenth = input.nextDouble();
		Square s = new Square(slenth);
		s.area();
		s.zhouchang();
	}
}
