import java.util.Scanner;

//�Ӽ���¼������˵ĳɼ���ͳ�Ƴɼ�����90�ֵ�����
public class CountScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		for(int i = 1;i <= 5;i++)
		{
			System.out.print("�������"+i + "���˵ĳɼ���");
			double score = input.nextDouble();
			if(score <= 90)
			{
				continue;
			}
			count++;
		}
		System.out.print("�ɼ���90�����ϵ�����Ϊ��" + count);
	}
}