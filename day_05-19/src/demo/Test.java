 package demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Master master = new Master();
		Dog dog = new Dog("����","���ɫ","��ʿ��");
		master.feed(dog);
		
		master.feed(new Penguin());
		Scanner input = new Scanner(System.in);
		System.out.print("��ѡ��Ҫ�����ĳ��1.�� 2.��죩");
		Pet pet = master.getPet(input.nextInt());
		if(pet == null) {
			System.out.println("����ʧ�ܣ�");
		}else {
			System.out.println("�����ɹ�1");
			master.feed(pet);
		}
	}
	
}
