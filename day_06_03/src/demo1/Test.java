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
		System.out.print("几何图形中圆和矩形的位置关系是：");
		ceom.showState();
		System.out.println("几何图形重新调整了圆和矩形的位置关系。");
		ceom.setRectangPosition(220, 160);
		ceom.setCirclePosition(40, 30);
		System.out.print("调整后，几何图形中圆和矩形的位置关系是：");
		ceom.showState();
	}
}
