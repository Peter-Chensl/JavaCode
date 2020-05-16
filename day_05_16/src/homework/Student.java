package homework;

public class Student extends People {
	public Student() {
		
	}
	
	public Student(String name, Gender sex, int age, String stuId) {
		super(name, sex, age);
		this.stuId = stuId;
	}

	private String stuId;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public void stady() {
		System.out.println(super.getName() + "ÕýÔÚÑ§Ï°");
	}
	public void print() {
		super.print();
		System.out.print("stuId:" + this.stuId);
		}
}
