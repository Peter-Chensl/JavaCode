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
		System.out.println("班级信息如下：");
		System.out.println("编号：" + Id);
		System.out.println("名称：" + name);
		System.out.println("地址：" + address);
		
	}
}
