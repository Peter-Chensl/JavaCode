package demo2;
/*
 * �Ƶ��Ա����
 * Ա������
 */
public abstract class Employee {
	
	public Employee() {
		super();
	}
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
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
	public abstract void work();

}
