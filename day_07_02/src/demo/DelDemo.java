package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DelDemo {
	public static void main(String[] args) {
		jdbcDemo1 jdbc = new jdbcDemo1();
		Scanner input = new Scanner(System.in);
		System.out.println("������ɾ��dvd�ı��");
		int id = input.nextInt();
		List list = new ArrayList();
		list.add(id);
		int row = jdbc.update("delete from dvd where id = ?", list);
		System.out.println(row >= 1?"ɾ���ɹ���":"ɾ��ʧ�ܣ�");
	}
}
