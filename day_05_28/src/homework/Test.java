package homework;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,11,15};
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ����֣�");
		int key = input.nextInt();
		BinSeach s = new BinSeach();
		int num = s.binSeacher(arr, key);
		if(num != -1) {
			System.out.println("�ҵ��ˣ�");
		}else {
			System.out.println("û���ҵ���");
		}
		int[] arr1 = {8,6,12,7,3,5};
		System.out.println("����ǰ��");
		s.print(arr1);
		s.selectSort(arr1);
		System.out.println("\n�����");
		s.print(arr1);
	}
}
