import java.util.Scanner;

//����������n��a, ��n = 4,a = 3,��3 + 33 + 333 + 3333�ĺ�
public class test1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������n��ֵ��");
		int n = input.nextInt();
		System.out.print("������a��ֵ��");
		int a = input.nextInt();
		int sum = 0,x = a;
		for(int i = 1;i <= n;i++){
			sum += a;
			a = a*10 + x;
		}
		System.out.print("sum = " + sum);
	}
}

class test2{
	public static void main(String[] args){
		/*ĳ��˾���ù��õ绰�������ݣ����ݶ�����λ�����ڴ��ݹ������Ǽ��ܵģ����ܹ������£�
		ÿλ���ֶ�����5��Ȼ���úͳ���10��������������֡��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ����
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ����");
		int num = input.nextInt();
		/*��һ�ַ���
		int gewei = num % 10;
		int shiwei = num / 10 % 10;
		int baiwei = num / 100 % 10;
		int qianwei = num / 1000;
		gewei = (gewei + 5) % 10;
		shiwei = (shiwei + 5) % 10;
		baiwei = (baiwei + 5) % 10;
		qianwei = (qianwei + 5) % 10;
		System.out.print(gewei + "" + shiwei + "" + baiwei + "" + qianwei);
		*/
		//�ڶ��ַ���
		int sum = 0;

		while(num != 0){
			int x = (num + 5) % 10;
			sum = sum * 10 + x;
			num /= 10;
		}
		System.out.print(sum);
	}

}
class test3{
	public static void main(String[] args){
		//��������5�仰���������
		Scanner input = new Scanner(System.in);
		String[] infos = new String[5];
		for(int i = 0;i < 5;i++){
			System.out.print("�������" + (i+1) + "�仰��");
			infos[i] = input.next();
		}
		System.out.println("-------�������------------");
		for(int j = 4; j >= 0;j--){
			System.out.println(infos[j]);
		}
	}
}