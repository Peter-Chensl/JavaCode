package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 1����������
2��ɾ������
3���޸�����
4����ʾ��������
5�����а�
0���˳�ϵͳ
 */
public class demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List array = new ArrayList();
		array.add(1);
		array.add(3);
		array.add(4);
		array.add(5);
		int num;
		do {
			System.out.println("0.�˳�");
			System.out.println("1.��������");
			System.out.println("2.ɾ������");
			System.out.println("3.�޸�����");
			System.out.println("4.��ʾ��������");
			System.out.println("5.���а�");
			System.out.println("��ѡ��");
			num = input.nextInt();
			switch(num) {
			case 0:
				break;
			case 1:
				System.out.println("��������Ҫ���ӵ�������");
				int myNum = input.nextInt();
				array.add(myNum);
				break;
			case 2:
				System.out.println("��������Ҫɾ�������֣�");
				int delNum = input.nextInt();
				array.remove(new Integer(delNum));
				break;
			case 3:
				System.out.println("�������޸�ǰ�����֣�");
				int oldNum = input.nextInt();
				if(array.contains(oldNum)) {
					System.out.println("�������޸ĺ�����֣�");
					int newNum = input.nextInt();
					int index = array.indexOf(oldNum);
					array.set(index, newNum);
				}else {
					System.out.println("�޸ĵ����ֲ����ڣ�");
				}
				
				break;
			case 4:
				for(int i = 0;i < array.size();i++) {
					System.out.print(array.get(i) + " ");
				}
				System.out.println();
				break;
			case 5:
				Collections.sort(array);
				break;
			default:
				System.out.println("����������������룡");
				break;
			}
		}while(num!=0);
	}
}
