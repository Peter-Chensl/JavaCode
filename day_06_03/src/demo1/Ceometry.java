package demo1;

public class Ceometry {
	
	public Ceometry(Rectangle rect, Circle circle) {
		this.rect = rect;
		this.circle = circle;
	}
	Rectangle rect;
	Circle circle;
	public void setCirclePosition(double x,double y) {
		circle.setX(x);;
		circle.setY(y);;
	}
	public void setCircleRadius(double radius) {
		circle.setRadius(radius);
	}
	public void setRectangPosition(double x,double y) {
		rect.setX(x);
		rect.setY(y);
	}
	public void setRectangWideAndHeight(double w,double h) {
		rect.setHeight(h);
		rect.setWide(w);
		
	}
	public void showState() {
		double circleX = circle.getX();
		double rectX = rect.getY();
		if(rectX - rect.getWide() >= circleX + circle.getRadius() ) {
			System.out.println("矩形在园的右侧");
		}
		if(rectX + rect.getWide() <= circleX - circle.getRadius()) {
			System.out.println("矩形在圆的左侧");
		}
	}
}
