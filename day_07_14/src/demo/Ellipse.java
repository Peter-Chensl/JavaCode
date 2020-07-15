package demo;
//定义子类椭圆，编写周长及面积代码
public class Ellipse extends Shape {
	double lhalfshaft , shalfshaft;

	public Ellipse(double lhalfshaft, double shalfshaft) {
		super();
		this.lhalfshaft = lhalfshaft;
		this.shalfshaft = shalfshaft;
		super.setName("椭圆");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return"椭圆的面积为：" + Math.PI*lhalfshaft*lhalfshaft;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return "椭圆的周长为：" + Math.PI*(lhalfshaft+lhalfshaft);
	}
}
