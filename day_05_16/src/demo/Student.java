package demo;

public class Student extends Person {
	public Student() {
		
	}
	String stuId;
	public void print() {
		/*System.out.println("name:" + super.name);
		System.out.println("sex:" + super.sex);
		System.out.println("age:" + super.age );*/
		
		//µÈ¼ÛÓÚ
		super.print();
		System.out.println("stuId:" + stuId);
	}
}
