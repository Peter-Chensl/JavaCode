import java.util.Scanner;

//��������5���˵ĳɼ�������ƽ���ֵ�����Ϊ����ʱֹͣ¼��
public class AvgGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0.0;
		int i;

		for(i = 1;i<=5;i++){
			System.out.print("�������" + i + "���˵ĳɼ���");
			double score = input.nextInt();
			sum += score;
			if(score < 0){
				break;
			}
		}
		if(6 == i){
		System.out.print("ƽ����Ϊ��" + sum / 5);
		}
	}
}