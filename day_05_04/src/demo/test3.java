package demo;

import java.util.Scanner;

public class test3 {
	public static void print() {
		for(int i = 100; i < 1000;i++) {
			if(isflag(i)) {
				System.out.print(i + " ");
			}
		}
	}
	//�ж�һ�����ǲ���ˮ�ɻ���
	public static boolean isflag(int num) {
		int sum = 0,num1 = num;
		while(num != 0) {
			int x = num % 10;
			sum += x * x * x;
			num /= 10;
		}
		return sum == num1;
	}
	//��1+2��+3��+��������+N���ĺ�
	public static int sum(int num) {
		int s = 0;
		for(int i = 1;i <= num;i++) {
			s += mul(i);
		}
		return s;
	}
	public static int mul(int num) {
		int s = 1;
		for(int i = 1;i <= num;i++) {
			s *= i;
		}
		return s;
	}
	public static void main(String[] args) {
		//print();
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();
		System.out.print(sum(num));
	}

}
