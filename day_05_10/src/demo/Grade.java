package demo;

public class Grade {
	public Grade() {
		
	}
	public Grade(int Id,String name,String address) {
		this.Id = Id;
		this.name = name;
		this.address = address;
	}
	int Id = 1801;
	String name = "�������";
	String address = "�������276��";
	
	public void print() {
		System.out.println("�༶��Ϣ���£�");
		System.out.println("Id: " + Id);
		System.out.println("name: " + name);
		System.out.println("address:" + address);
	}

}
