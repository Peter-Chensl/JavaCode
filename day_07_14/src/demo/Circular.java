package demo;
//定义子类圆形，编写周长及面积代码
public class Circular extends Shape{
	double ridius;

	public Circular(double ridius) {
		super();
		this.ridius = ridius;
		super.setName("圆形");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return "圆形的面积为：" + Math.PI*ridius*ridius;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return "圆形的周长为：" + Math.PI*ridius*2;
	}
}
