package homework;

import java.util.Scanner;

public class demo10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个不多于5位数的正整数：");
		int num = input.nextInt();
		int[] arr =  new int[5];
		int count = 0,i = 0;
		while(num % 10 !=0) {
			count++;
			arr[i] = num % 10;
			i++;
			num /= 10;
		}
		System.out.println(count);
		for(int j = 0;j < count;j++) {
			System.out.println(arr[j]);
		}
	}
}
