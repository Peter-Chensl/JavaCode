package demo;

public class pub {
	public pub() {
		
	}
	public pub(int pubId,String pubName) {
		this.pubId = pubId;
		this.pubName = pubName;
	}
	int pubId = 202011;
	String pubName = "�»�������";
	String pubAddress = "�������276��";
	
	public void show() {
		System.out.println("��������Ϣ���£�");
		System.out.println("��ţ�" + pubId);
		System.out.println("���������ƣ�" + pubName);
		System.out.print("�������ַ��" + pubAddress);
	}
}
