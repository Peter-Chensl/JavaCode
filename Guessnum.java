import java.util.Scanner;

//������Ϸ������һ����0��100��֮������������ʾ�û�����²�����֣�
public class Guessnum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		int random = (int)(Math.random()*100);//����һ����0��100���������
		while(true){
			System.out.print("��������²�����֣�");
			int guess = input.nextInt();
			count++;
			if(guess == random){
				System.out.println("��ϲ�㣡�¶��ˣ�������Ǹ�С����أ�");
				System.out.print("��Ϸ����");
				break;
			}else if(guess > random){
				System.out.print("ѽ����µ������е���ˣ�\n");
			}else{
				System.out.print("���С�ˣ�\n");
			}
		}
		System.out.print("��һ������" + count +"��");
	}
}