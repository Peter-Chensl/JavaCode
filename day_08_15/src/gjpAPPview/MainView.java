package gjpAPPview;



import java.util.List;
import java.util.Scanner;

import gjpAPPcontril.ZhangwuContril;
import gjpAPPdomain.ZhangWu;

public class MainView {
	private ZhangwuContril contril = new ZhangwuContril();
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("--------------�ܼ��ż�ͥ�������-------------------");
			System.out.println("-             1.�������                                                                               -");
			System.out.println("-             2.�༭����                                                                               -");
			System.out.println("-             3.ɾ������                                                                               -");
			System.out.println("-             4.��ѯ����                                                                               -");
			System.out.println("-             5.�˳�����                                                                               -");
			System.out.println("������Ҫִ�еĲ�����š�1-5����");
			int choose = sc.nextInt();
			switch(choose) {
			case 1:
			//	addZhangWu();
				break;
			case 2:
			//	editZhangWu();
				break;
			case 3:
				//hangWu();
				break;
			case 4:
				selectZhangWu();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("û�д�ѡ����������룡");
				break;
			}
		}
		
	}
	public void selectZhangWu() {
		System.out.println("1.��ѯ����   2.������ѯ");
		Scanner sc = new Scanner(System.in);
		int selectChoose = sc.nextInt();
		
		switch(selectChoose) {
		case 1:
			selectAll();
			break;
		case 2:
			select();
			break;
		default:
			System.out.println("�����������������!");
			break;
		}
	}
	/*���巽����ʵ�ֲ�ѯ���ֵ�����
	 * 
	 */
	public void selectAll() {
		//���ÿ��Ʋ��е÷�������ѯ��������*/
		List<ZhangWu> list = contril.selectAll();
		System.out.println("ID\t���\t�˻�\t���\tʱ��\t˵��");
		for(ZhangWu zw :list) {
			System.out.println(zw.getZwid()+ "\t"+zw.getFlname()+"\t"+zw.getZhanghu()+"\t"+zw.getMoney()+"\t"+zw.getCreatetime()+"\t"+zw.getDescription());
		}
	}
	/*���巽����ʵ��������ѯ
	 * 
	 */
	public void select() {
		
	}
}
