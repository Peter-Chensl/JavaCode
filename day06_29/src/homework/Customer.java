package homework;

public class Customer {
	
	public Customer() {
		super();
	}
	public Customer(String name, int age, String id, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.tel = tel;
	}
	// Ù–‘
	private String name;
	private int age;
	private String id;
	private String tel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
