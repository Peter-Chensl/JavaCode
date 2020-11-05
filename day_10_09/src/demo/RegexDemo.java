package demo;

import java.util.Scanner;

public class RegexDemo {
	public static void main(String[] args) {
		/*String regex = "[1-9][0-9]{4,14}";
		System.out.println("ÇëÊäÈëQQºÅ");
		Scanner input = new Scanner(System.in);
		String qq = input.next();
		boolean flag = qq.matches(regex);
		System.out.println(flag);*/
		/*String regex = "[£¬¡£]";
		System.out.println("ÇëÊäÈëÒª·Ö¸îµÄ×Ö·û´®£º");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		String ss[] = s.split(regex);
		for(String s1:ss) {
			System.out.println(s1);*/
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		String str = input.nextLine();
		str = str.replaceAll("[\\d+]", "#");
		System.out.println(str);
		
	}
}
