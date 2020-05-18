package demo;

public class Circle {
	double radius,area;
	public Circle(){
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	void setRadius(double j) {
		if(j > 0) {
			radius = j;
		}
	}
	public double getArea() {
		area = 3.14*radius*radius;
		return area ;
	}
	public double getRadius() {
		return radius;
	}
	
	
}
