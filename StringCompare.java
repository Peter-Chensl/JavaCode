import java.util.Scanner;

//����û�������"admin",�������123456���������ӭ��,admin,����������Բ���������󣬵�¼ʧ�ܣ���
public class StringCompare{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String name = input.next();
		System.out.println("\n������6λ�����룺");
		String pass = input.next();
		if(name.equals("admin") && pass.equals("123456")){
			System.out.print("��¼�ɹ�@����ӭ����admin!");
		}else{
			System.out.print("��¼ʧ�ܣ����������˺ź������Ƿ���ȷ��");
		}
	}
}