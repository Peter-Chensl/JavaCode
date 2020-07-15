package demo;
//定义正六边形
public class Hexagon extends Shape {
	double lenth;
	double a = Math.sqrt(2);
	public Hexagon(double lenth) {
		super();
		this.lenth = lenth;
		super.setName("正六边形");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return"正六边形的面积为：" + 3/2*a*lenth*lenth;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return"正六边形的边长为：" + 6*lenth;
	}
}
