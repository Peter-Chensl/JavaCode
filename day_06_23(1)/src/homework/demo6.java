package homework;

import java.util.Scanner;

public class demo6 {
	public static void main(String[] args) {
		System.out.println("������һ����ݣ�");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if(year%4 == 0 && year % 100 !=0 || year % 400==0) {
			System.out.println(year + "����366��");
		}else {
			System.out.println(year + "����365��");
		}
	}
}
