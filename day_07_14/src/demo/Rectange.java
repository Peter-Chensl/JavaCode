package demo;

public class Rectange extends Shape{
	double wide;
	double height;
	public Rectange(double wide, double height) {
		super();
		this.wide = wide;
		this.height = height;
		super.setName("矩形");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return"矩形的面积为：" + wide*height;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return "矩形的周长为：" + (wide+height)*2;
	}

}
