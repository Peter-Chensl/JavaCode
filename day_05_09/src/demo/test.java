package demo;

public class test {
	public test() {
		
	}
	public test(String name) {
		this.name = name;
	}
	public test(int Id,String name,String address) {
		this.Id = Id;
		this.name = name;
		this.address = address;
	}
	int Id = 400;
	String name;
	String address;
	
	public void Show(){
		System.out.println("�༶��Ϣ���£�");
		System.out.println("��ţ�" + Id);
		System.out.println("���ƣ�" + name);
		System.out.println("��ַ��" + address);
		
	}
}
