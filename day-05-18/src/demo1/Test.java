package demo1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����복��");
		String info = input.next();
		Type t;
		if(info.equals("ԽҰ")) {
			t = Type.ԽҰ;
			Car car = new Car("����", "��F66666", t);
			System.out.println("���Ϊ��" + car.getSumRent(10));
		}
		if(info.equals("����")) {
			t = Type.����;
			Car car = new Car("����", "��F66666", t);
			System.out.println("���Ϊ��" + car.getSumRent(10));
		}
		if(info.equals("����")) {
			t = Type.����;
			Car car = new Car("����", "��F66666", t);
			System.out.println("���Ϊ��" + car.getSumRent(10));
		}
		
		Bus bus = new Bus("У��", "��E12344", 60);
		System.out.println("���Ϊ��" + bus.getSumRent(2));
	}
}
