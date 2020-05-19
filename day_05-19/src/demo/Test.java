 package demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Master master = new Master();
		Dog dog = new Dog("王拆","红褐色","哈士奇");
		master.feed(dog);
		
		master.feed(new Penguin());
		Scanner input = new Scanner(System.in);
		System.out.print("请选择要领养的宠物（1.狗 2.企鹅）");
		Pet pet = master.getPet(input.nextInt());
		if(pet == null) {
			System.out.println("领养失败！");
		}else {
			System.out.println("领养成功1");
			master.feed(pet);
		}
	}
	
}
