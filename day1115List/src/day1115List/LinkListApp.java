package day1115List;

import java.util.Scanner;

public class LinkListApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idata;
		double ddata;
		LinkList theList = new LinkList();
		int select = 1;
		while(true) {
			System.out.println("###############################");
			System.out.println("# [1] pushfirst [2] detelete  #");
			System.out.println("# [3] find      [4] show      #");
			System.out.println("###############################");
			System.out.println("��ѡ��");
			select = input.nextInt();
			switch(select)
			{
				case 1:
					System.out.println("��������Ҫ�����Ԫ�أ���-1��-1.0����");
					while(true) {
						idata = input.nextInt();
						ddata = input.nextDouble();
						if((idata == -1)&&(ddata == -1.0))
						{
							break;
						}
						theList.insertFirst(idata, ddata);
					}
					break;
				case 2:
					theList.deteleFirst();
					System.out.println("ɾ���ɹ���");
					break;
				case 3:
					System.out.println("��������Ҫ���ҵ�ֵ��");
					idata = input.nextInt();
					Link p = theList.LinkFind(idata);
					if(p != null)
					{
						System.out.println("�ҵ��ˣ�");
					}
					else
						System.out.println("û���ҵ���");
					break;
				case 4:
					theList.displayList();
					break;
				default:
					System.out.println("����������������룡");
					break;
			}
		}
		/*theList.insertFirst(22, 3.00);
		theList.insertFirst(23, 3.01);
		theList.insertFirst(24, 3.02);
		theList.insertFirst(25, 3.03);
		theList.insertFirst(26, 3.04);
		theList.displayList();
		
		while(!theList.isEmpty())
		{
			Link aLink = theList.deteleFirst();
			System.out.println("Delete ");
			aLink.disPlay();
			System.out.println(" ");
		}
		theList.displayList();*/
	}
}
