package cn.xuexi.gjp.view;
/*
 * ��ͼ��
 * ���ݴ��ݸ�Controller ��
 */

import java.util.List;
import java.util.Scanner;

import cn.xuexi.gjp.contorller.ZhangWuController;
import cn.xuexi.gjp.domain.ZhangWu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();
	
	public void run() {
		//����Scanner����
		Scanner sc = new Scanner(System .in);
		while(true) {
			System.out.println("----------------�ܼ��ż������-----------------");
			System.out.println("1.��ӷ���           2.�༭����       3.ɾ������     4.��ѯ����      5.�˳�ϵͳ");
			System.out.println("��������š�1-5����");
			//�����û���ѡ��
			int choose = sc.nextInt();
			switch(choose) {
			case 1:
				addZhangWu();
				break;
			case 2:
				editZhangWu();
				break;
			case 3:
				deleteZhangwu();
				break;
			case 4:
				selectZhangWu();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("û�д�ѡ�����������");
				break;
			}
		}
	}
	/*
	 * ���巽��ʵ��ɾ������
	 */
	public void deleteZhangwu() {
		selectAll();
		System.out.println("ѡ�����ɾ�����ܣ�������Ҫɾ����Id:");
		Scanner sc = new Scanner(System.in);
		int zwid = sc.nextInt();
		controller.deleteZhangwu(zwid);
	}
	
	/*
	 * ���巽����ʵ������ı༭����
	 */
	public void editZhangWu() {
		//���ò�ѯ�����������ݵĹ��ܣ���ʾ����
		selectAll();
		System.out.println("ѡ����Ǳ༭���ܣ�����������");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ID��");
		int zwid = sc.nextInt();
		System.out.println("����������ƣ�");
		String flname = sc.next();
		System.out.println("�����");
		double money = sc.nextDouble();
		System.out.println("�����˻���");
		String zhanghu = sc.next();
		System.out.println("�������ڣ���ʽXXXX-XX-XX");
		String createtime = sc.next();
		System.out.println("����������");
		String descrition = sc.next();
		//���û���������ݷ�װ
		ZhangWu zw = new ZhangWu(zwid, flname, money, zhanghu, createtime, descrition);
		//����controller���еķ���ʵ�ֱ༭����
		controller.addZhangWu(zw);
	}
	
	/*
	 * ���巽��addZhangWu
	 * �������ķ���
	 */
	public void addZhangWu() {
		System.out.println("ѡ�������������ܣ��������������ݣ�");
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ƣ�");
		String flname = sc.next();
		System.out.println("�����");
		double money = sc.nextDouble();
		System.out.println("�����˻���");
		String zhanghu = sc.next();
		System.out.println("�������ڣ���ʽXXXX-XX-XX");
		String createtime = sc.next();
		System.out.println("����������");
		String descrition = sc.next();
		ZhangWu zw = new ZhangWu(0, flname, money, zhanghu, createtime, descrition);
		controller.addZhangWu(zw);
		System.out.println("��ϲ���������ɹ���");
	}
	/*
	 * ���巽��selectZhangWu()
	 * ��ʾ��Ѱ�÷�ʽ
	 */
	public void selectZhangWu() {
		System.out.println("1.��ѯ����  2.������ѯ");
		Scanner sc = new Scanner(System.in);
		int selectChooser = sc.nextInt();
		switch(selectChooser) {
		case 1:
			//��ѯ����
			selectAll();
			break;
		case 2:
			//������ѯ
			select();
			break;
		default:
			System.out.println("û�д�ѡ����������룡");
			break;
		}
	}
	/*
	 * ���巽����ʵ�ֲ�ѯ���е���������
	 */
	public void selectAll() {
		//���ÿ��Ʋ��еķ���
		List<ZhangWu> list = controller.selectAll();
		print(list);
	}
	private void print(List<ZhangWu> list) {
		System.out.println("ID\t\t���\t\t�˻�\t\t���\t\tʱ��\t\t\t˵��");
		for(ZhangWu zw :list) {
			System.out.println(zw.getZwid() + "\t\t"+zw.getFlname()+ "\t\t"+zw.getZhanghu()+ "\t\t"+zw.getMoney()+ "\t\t"+zw.getCreatetime()+ "\t\t"+zw.getDescrition());
		}
	}
	/*
	 * ���巽��ʵ��������ѯ����
	 */
	public void select() {
		System.out.println("ѡ���ѯ���ܣ��������ѯ���ڸ�ʽΪXXXX-XX-XX");
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ʼ���ڣ�");
		String startDate = sc.nextLine();
		System.out.println("������������ڣ�");
		String endDate = sc.nextLine();
		List<ZhangWu> list = controller.select(startDate, endDate);
		if(list.size() != 0) {
			print(list);
		}else {
			System.out.println("û�в�ѯ�����ݣ�");
		}
	}
}
