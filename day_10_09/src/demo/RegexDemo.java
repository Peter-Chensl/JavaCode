package demo;

import java.util.Scanner;

public class RegexDemo {
	public static void main(String[] args) {
		/*String regex = "[1-9][0-9]{4,14}";
		System.out.println("������QQ��");
		Scanner input = new Scanner(System.in);
		String qq = input.next();
		boolean flag = qq.matches(regex);
		System.out.println(flag);*/
		/*String regex = "[����]";
		System.out.println("������Ҫ�ָ���ַ�����");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		String ss[] = s.split(regex);
		for(String s1:ss) {
			System.out.println(s1);*/
		Scanner input = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str = input.nextLine();
		str = str.replaceAll("[\\d+]", "#");
		System.out.println(str);
		
	}
}
