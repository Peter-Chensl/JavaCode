package demo;

public class CXF {
	public CXF(double width,double height) {
		this.height = height;
		this.width = width;
	}
	private double width;
	private double height;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area(double w,double h) {
		return h*w;
	}

}
