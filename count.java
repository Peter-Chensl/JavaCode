import java.util.Scanner;

//�Ӽ��������������͸������ֱ�ͳ�������ĸ����͸����ĸ������������������ĺͣ�����0��ʾ����
public class count{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count1 = 0;//ͳ����������
		int count2 = 0;//ͳ�Ƹ�������
		double sum = 0;
		while(true){
			System.out.print("������һ������");
			double num = input.nextDouble();
			if(0 == num){
				break;
			}else if(num > 0){
				count1++;
			}else{
				count2++;
			}
			sum +=num;
		}
		System.out.print("�����ĸ���" + count1 );
		System.out.print("�����ĸ���" +count2  );
		System.out.print( "�������ֵĺ�Ϊ��" +sum );
	}
}