import java.util.Scanner;

//����������༶��ÿ���༶���ĸ�ѧ�����������ǵĳɼ���������ƽ����
public class test1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			for(int i = 1; i <= 3 ;i++){
				double sum = 0;
				System.out.println("�������" + i + "���༶�ĳɼ�:");
				for(int j = 1;j <= 4;j++)
				{
					System.out.print("�������" + j + "���˵ȳɼ�:");
					double score = input.nextDouble();
					sum += score;
				}
				System.out.println("ƽ����Ϊ��" + sum/4);
			}
	}
}