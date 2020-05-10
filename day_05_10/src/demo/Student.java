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
		System.out.println("学生基本信息如下：");
		System.out.println("学号 ：" + stuId);
		System.out.println("学生姓名：" + stuName);
		System.out.println("学生性别：" + stuSex);
		System.out.println("学生年龄：" + stuAge);
		System.out.println("班级编号:" + grade.Id);
		System.out.println("班级名称：" + grade.name);
	}
}
