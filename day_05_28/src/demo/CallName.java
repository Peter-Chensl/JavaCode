package demo;

import java.util.ArrayList;
import java.util.Random;

public class CallName {
	public static void main(String[] args) {
		ArrayList <Student> array = new ArrayList<Student>();
		add(array);
		printArray(array);
		ran(array);
	}
	public static void ran(ArrayList<Student> array) {
		Random ran = new Random();
		int index = ran.nextInt(array.size());
		Student stu = array.get(index);
		System.out.println(stu.name + " " +stu.age);
	}
	
	public static void printArray(ArrayList<Student> array) {
		for(int i = 0; i < array.size();i++) {
			Student s = array.get(i);
			System.out.println("������" + " " + s.name + "   " + "���䣺" + " " + s.age);
		}
	}
	
	public static void add(ArrayList<Student> array) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		Student stu5 = new Student();
		
		stu1.name = "�Ž�";
		stu1.age = 22;
		
		stu2.name = "������";
		stu2.age = 26;
		
		stu3.name = "�ּҿ�";
		stu3.age = 32;
		
		stu4.name = "����";
		stu4.age = 45;
		
		stu5.name = "����";
		stu5.age = 12;
		
		array.add(stu1);
		array.add(stu2);
		array.add(stu3);
		array.add(stu4);
		array.add(stu5);
		}

}
