package homework;

import java.util.Scanner;

public class demo5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��ʱ�䣡");
		int time = input.nextInt(); 
		if(time >= 0 && time <= 6) {
			System.out.println("�������賿��");
		}else if(time >= 7 && time <= 12) {
			System.out.println("����������");
		}else if(time >=13 && time <= 18) {
			System.out.println("����������");
		}else {
			System.out.println("����������");
		}
	}
}
