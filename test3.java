import java.util.Scanner;

//ȥ�̳�����涨ֻ��ȥ5���̵꣬ÿ��ֻ������3����Ʒ
public class test3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;//ͳ�ƹ�����Ʒ������
		for(int i = 1;i <= 5;i++){
			System.out.println("��ӭ���ٵ�" + i + "���̵�");
			for(int j = 1;j <= 3;j++){
				System.out.println("�Ƿ������Ʒ(y/n):");
				char info = input.next().charAt(0);
				if(info == 'n'){
					break;
				}
				count++;
			}
		}
		System.out.println("һ��������" + count + "����Ʒ");
	}
}