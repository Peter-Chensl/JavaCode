package homework;

import java.util.Scanner;

public class demo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����������");
		int N = input.nextInt();
		boolean flag = true;
		for(int i = 1;i< N ;i++) {
			if(0 == N % i) {
				flag = false;
			}
		}
		if(false == false) {
			System.out.println(N + "��������");
		}else {
			System.out.println(N + "������");
		}
	}
}
