package demo;

import java.util.Scanner;

public class test {
	//���1-50�����е������������޲�������ֵ�ķ���
//	public static void PrintNum() {
//		int i = 1;
//		for(;i < 50;i++) {
//			if(i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
//	}
//	
	//��ʮ����ת��Ϊ������
//	public static void change() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("������һ��ʮ������������");
//		int num = input.nextInt();
//		String info = " ";
//		while(num != 0) {
//			int x = num % 2;
//			info = x +info;
//			num /= 2; 
//		}
//		System.out.print(info);
//	}
	//����1-100�ĺ�
//	public static int SumNum() {
//		int sum = 0;
//		for(int i = 1; i <= 100;i++) {
//			sum += i;
//		}
//		return sum;
//	}
	//��дһ��������ʵ�����һ��ѧ���������Ϣ���༶���ơ��Ա����䡢��ߣ�
	public static void printStu(String className,String name,char sex,double height) {
		System.out.println("ѧ����Ϣ����");
		System.out.println("�༶��" + className);
		System.out.println("������" + name);
		System.out.println("�Ա�" + sex);
		System.out.println("��ߣ�" + height);
	}
	public static void main(String[] args) {
		//PrintNum();
		//change();
//		int num = SumNum();
//		System.out.print(num);
		Scanner input = new Scanner(System.in);
		System.out.print("������༶��");
		String className = input.next();
		System.out.print("������ѧ��������");
		String name = input.next();
		System.out.print("�������Ա�");
		char sex = input.next().charAt(0);
		System.out.print("��������ߣ�");
		int height = input.nextInt();
		printStu(className,name,sex,height);
	}
}
