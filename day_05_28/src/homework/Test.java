package homework;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,11,15};
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要查找的数字：");
		int key = input.nextInt();
		BinSeach s = new BinSeach();
		int num = s.binSeacher(arr, key);
		if(num != -1) {
			System.out.println("找到了！");
		}else {
			System.out.println("没有找到！");
		}
		int[] arr1 = {8,6,12,7,3,5};
		System.out.println("排序前：");
		s.print(arr1);
		s.selectSort(arr1);
		System.out.println("\n排序后：");
		s.print(arr1);
	}
}
