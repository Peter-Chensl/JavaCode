import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		System.out.print("������һ������ݣ�");
		Scanner info = new Scanner(System.in);
		int year = info.nextInt();
		String result = year % 400 == 0?"��":year % 4 == 0&&year%100!=0?"��":"����";
		System.out.print("\n" + year + "��"+result + "����");	
	}
}