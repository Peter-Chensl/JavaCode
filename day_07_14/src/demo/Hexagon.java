package demo;
//������������
public class Hexagon extends Shape {
	double lenth;
	double a = Math.sqrt(2);
	public Hexagon(double lenth) {
		super();
		this.lenth = lenth;
		super.setName("��������");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return"�������ε����Ϊ��" + 3/2*a*lenth*lenth;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return"�������εı߳�Ϊ��" + 6*lenth;
	}
}
