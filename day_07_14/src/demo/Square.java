package demo;

public class Square extends Shape {
	double slenth;

	public Square(double slenth) {
		this.slenth = slenth;
		super.setName("������");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return"�����ε����Ϊ��" + slenth*slenth;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return "�����εı߳�Ϊ��" + slenth*4;
	}
	
	
}
