import java.util.Scanner;


//ѧϰ�ƻ�������һ����������������ѧϰJava�����ڶ�����������������ѧϰC���ԣ���������Ϣ��

public class StudyTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("���������ڼ���1-7����");
		int day = input.nextInt();
		if(1 == day || 3 == day || 5 == day){
			System.out.println("ѧϰJava");
		}else if(2 == day || 6 == day){
			System.out.println("ѧϰC����");
		}else{
			System.out.println("��Ϣ");
		}
	}
}