package demo;

import java.util.Scanner;

public class test {
	//���������������Լ������С������
	public static int getMax(int num1,int num2) {
		if(num1 == num2) {
			return num1;
		}
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for(int i = num1;i >= 1;i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������������");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int result = getMax(num1,num2);
		System.out.println(num1 + " " + num2 + "�����Լ����:" + result);
		System.out.println(num1 + " " + num2 + "����С��������:" + num1*num2/result);
	}
}


