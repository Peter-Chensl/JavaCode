package homework;

import java.util.Scanner;

public class demo8 {
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
				switch(count) {
				case 1:
					System.out.println("��̫�в��ˣ�");
					break;
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					System.out.println("��ô��Ͳų����ˣ��ܴ���ô��");
					break;
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
					System.out.println("���˰���Ų³�����Сͬ־������Ŭ������");
					break;
				default:
					System.out.println("�Բ������Դﵽ���²������");
					break;
				}
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
