import java.util.Scanner;

public class test4{
	public static void main(String[] args){
		//��1-2+3-4+5.....n�ĺ�
		//��һ�ַ���
		/*int sum = 0;
		System.out.print("������һ����������");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 1;i <= num;i++){
			if(i % 2 == 0){
				sum -= i;
			}else{
				sum += i;
			}
		}
		System.out.printf("sum = " + sum);*/
		//�ڶ��ַ���
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����������");
		int num = input.nextInt();
		int j = 1;
		int sum = 0;
		for(int i =1;i <= num;i++){
			sum += i*j;
			j = -j;
		}
		System.out.print("sum = " + sum);
	}
}
class test5	{
	public static void main(String[] args){
		//��������������Χ֮�����ʼλ��
		Scanner input = new Scanner(System.in);
		System.out.print("��������ʼλ�ã�");
		int start = input.nextInt();
		System.out.print("���������λ�ã�");
		int end = input.nextInt();
		int sum = 0;
		for(;start <= end;start++){
			if(start % 2 != 0){
				sum += start;
			}
		}
		System.out.print("sum = " + sum);
	}
}
class test6{
	public static void main(String[] args){
		//��ӡ������λ����ˮ�ɻ���
		int i = 100;
		for(;i < 1000;i++){
			int gewei = i % 10;
			int shiwei = i / 10 % 10;
			int baiwei = i / 100;
			int sum = gewei *gewei*gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei;
			if(i == sum){
				System.out.println(i);
			}
		}
		
	}
	
}
class test7{
	public static void main(String[] args){
		double sum = 0.0;
		for(double i = 1; i <= 97;i +=2){
			sum += i / (i + 2);
		}
		System.out.print("sum =" + String.format("%.2f",sum));
	}
}

class test8{
	public static void main(String[] args){
		//�ж�һ�����Ƿ�Ϊ����
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������");
		int num = input.nextInt();
		int i;
		for(i = 2;i < num;i++){
			if(num % i == 0){
				System.out.print(num + "��������");
				break;
			}
		}
		if(i == num){
			System.out.print(num + "������");
		}
	}
}