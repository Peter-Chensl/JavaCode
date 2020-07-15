package demo;

public class Square extends Shape {
	double slenth;

	public Square(double slenth) {
		this.slenth = slenth;
		super.setName("正方形");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return"正方形的面积为：" + slenth*slenth;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return "正方形的边长为：" + slenth*4;
	}
	
	
}
