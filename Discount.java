import java.util.Scanner;

public class Discount{
	public static void main(String[] args){
		//��ͨ�û�������100Ԫ������ۣ���Ա�û������8.5�ۣ���Ա������200Ԫ��7.5�ۣ����������
		Scanner input = new Scanner(System.in);
		System.out.print("�������Ƿ��ǻ�Ա(Y/N):");
		char vip = input.next().charAt(0);

		System.out.print("\n���������ѽ�");
		double money = input.nextDouble();
		double summoney = 0.0;
		if('Y' == vip){
			if(money >= 200){
				summoney = money*0.75;
			}
			else{
				summoney = money*0.85;
			}
		}
		else{
			if(money >= 100){
				summoney = money*0.95;
			}
			else{
				summoney = money;
			}
			
		}
		System.out.print("�ܽ��Ϊ��" + summoney);
	
	}
} 