import java.util.Scanner;

public class Week{
	public static void main(String[] args){
		Scanner info= new Scanner(System.in);
		System.out.print("������1-7�е���һ����: ");
		int day1 = info.nextInt();
		System.out.print("��������������: ");
		int day2 = info.nextInt();
		int day3 = (day1+day2)%7;
		day3 = day3 == 0 ? 7 : day3;
		System.out.print("�������������" + day1 + "," + "��ô���" + day2 + "���������" + day3);
	}
}