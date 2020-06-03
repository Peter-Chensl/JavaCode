package demo1;

public class Rectangle {
	double x,y,wide,height;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWide() {
		return wide;
	}

	public void setWide(double wide) {
		if(wide > 0) {
			this.wide = wide;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height > 0) {
			this.height = height;
		}
	}
	
}
