package demo1;
/**
 * 
 * @author Administrator
 *
 */

public class Test {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Circle circle = new Circle();
		
		Ceometry ceom;
		ceom = new Ceometry(rect, circle);
		ceom.setRectangPosition(30, 40);
		ceom.setRectangWideAndHeight(120, 80);
		ceom.setCirclePosition(290, 30);
		ceom.setCircleRadius(60);
		System.out.print("����ͼ����Բ�;��ε�λ�ù�ϵ�ǣ�");
		ceom.showState();
		System.out.println("����ͼ�����µ�����Բ�;��ε�λ�ù�ϵ��");
		ceom.setRectangPosition(220, 160);
		ceom.setCirclePosition(40, 30);
		System.out.print("�����󣬼���ͼ����Բ�;��ε�λ�ù�ϵ�ǣ�");
		ceom.showState();
	}
}
