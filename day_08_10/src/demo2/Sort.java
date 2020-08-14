package demo2;

public class Sort {
	private int id;
	private String name;
	private String publish;
	public Sort(int id, String name, String publish) {
		super();
		this.id = id;
		this.name = name;
		this.publish = publish;
	}
	
	public Sort() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}

	@Override
	public String toString() {
		return "Sort [id=" + id + ", name=" + name + ", publish=" + publish + "]";
	}
	
	
}
