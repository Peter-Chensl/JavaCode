package demo;
//����������Բ����д�ܳ����������
public class Ellipse extends Shape {
	double lhalfshaft , shalfshaft;

	public Ellipse(double lhalfshaft, double shalfshaft) {
		super();
		this.lhalfshaft = lhalfshaft;
		this.shalfshaft = shalfshaft;
		super.setName("��Բ");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return"��Բ�����Ϊ��" + Math.PI*lhalfshaft*lhalfshaft;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return "��Բ���ܳ�Ϊ��" + Math.PI*(lhalfshaft+lhalfshaft);
	}
}
