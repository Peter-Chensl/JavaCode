package demo;

public class Student {
	public Student() {
		
	}
	public Student(int stuId,String stuName,char stuSex,int stuAge) {
		this.stuId  = stuId;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge = stuAge;
	}
	int stuId;
	String stuName;
	char stuSex;
	int stuAge;
	Grade grade = new Grade();
	//grade =new  Grade();
	public void show() {
		System.out.println("ѧ��������Ϣ���£�");
		System.out.println("ѧ�� ��" + stuId);
		System.out.println("ѧ��������" + stuName);
		System.out.println("ѧ���Ա�" + stuSex);
		System.out.println("ѧ�����䣺" + stuAge);
		System.out.println("�༶���:" + grade.Id);
		System.out.println("�༶���ƣ�" + grade.name);
	}
}
