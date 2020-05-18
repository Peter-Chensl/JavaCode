package demo1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入车型");
		String info = input.next();
		Type t;
		if(info.equals("越野")) {
			t = Type.越野;
			Car car = new Car("宝马", "贵F66666", t);
			System.out.println("租金为：" + car.getSumRent(10));
		}
		if(info.equals("两厢")) {
			t = Type.两厢;
			Car car = new Car("宝马", "贵F66666", t);
			System.out.println("租金为：" + car.getSumRent(10));
		}
		if(info.equals("三厢")) {
			t = Type.三厢;
			Car car = new Car("宝马", "贵F66666", t);
			System.out.println("租金为：" + car.getSumRent(10));
		}
		
		Bus bus = new Bus("校车", "陕E12344", 60);
		System.out.println("租金为：" + bus.getSumRent(2));
	}
}
