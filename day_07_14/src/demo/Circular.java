package demo;
//��������Բ�Σ���д�ܳ����������
public class Circular extends Shape{
	double ridius;

	public Circular(double ridius) {
		super();
		this.ridius = ridius;
		super.setName("Բ��");
	}
	@Override
	public String area() {
		// TODO Auto-generated method stub
		return "Բ�ε����Ϊ��" + Math.PI*ridius*ridius;
	}
	@Override
	public String zhouchang() {
		// TODO Auto-generated method stub
		return "Բ�ε��ܳ�Ϊ��" + Math.PI*ridius*2;
	}
}
