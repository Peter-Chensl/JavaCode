package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateRest {
	public static void main(String[] args) throws Exception {
		function1();
	}
	public static void function1() throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("������������� ��ʽYYY-MM-dd");
		String birthdayString = input.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		Date birthdayDate = sdf.parse(birthdayString);
		
		Date today = new Date();
		
		long birthdaySecond = birthdayDate.getTime();
		long todaySecond = today.getTime();
		long day = todaySecond - birthdaySecond;
		
		if(day < 0) {
			System.out.println("����û�����أ�");
		}else {
		System.out.println(day/1000/60/60/24);
		}
	}
}
