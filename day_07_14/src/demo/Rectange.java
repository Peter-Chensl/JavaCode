package demo;

public class Rectange extends Shape{
	double wide;
	double height;
	public Rectange(double wide, double height) {
		super();
		this.wide = wide;
		this.height = height;
		super.setName("����");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return"���ε����Ϊ��" + wide*height;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return "���ε��ܳ�Ϊ��" + (wide+height)*2;
	}

}
