package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class updateDemo {
	public static void main(String[] args) {
		jdbcDemo1 jdbc = new jdbcDemo1();
		Scanner sc = new Scanner(System.in);
		List<Object> list = new ArrayList<Object>();
		System.out.println("����������ʵ�����");
		list.add(sc.next());
		System.out.println("�������������");
		list.add(sc.next());
		System.out.println("������dvd���");
		list.add(sc.nextInt());
		int row = jdbc.update("update dvd set state = 1,borname = ?,borDate = ?,times = times+1 where id = ?", list);
		System.out.println(row >= 1?"���ĳɹ���" : "����ʧ�ܣ�");
	}
}
