package demo1;

public class Vehicle {
	//����
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	//����
	private String name;
	private String id;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	//����
	public double getSumRent(int days) {
		return 0;
	}

}
