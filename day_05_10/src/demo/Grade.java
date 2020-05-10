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
	String name = "软件工程";
	String address = "长宁大姐276号";
	
	public void print() {
		System.out.println("班级信息如下：");
		System.out.println("Id: " + Id);
		System.out.println("name: " + name);
		System.out.println("address:" + address);
	}

}
