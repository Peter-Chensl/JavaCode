package demo;

public class test {
	public static void main(String[] args) {
		student stu1 = new student();
		student stu2 = new student();
		stu1.age = 18;
		stu1.name = "张三";
		stu2.age = 18;
		stu2.name = "张三";
		
		boolean b = stu1.equals(stu2); 
		System.out.println(b);
		
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
	}
}
