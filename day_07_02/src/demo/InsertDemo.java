package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] args) {
		jdbcDemo1 jdbc = new jdbcDemo1();
		Scanner sc = new Scanner(System.in);
		List<Object> list = new ArrayList<Object>();
		System.out.println("������dvd������");
		list.add(sc.next());
		System.out.println("������dvd�ļ۸�");
		list.add(sc.nextDouble());
		System.out.println("������dvd�ĳ�����");
		list.add(sc.next());
		int row = jdbc.update("insert into dvd values(null,?,?,?,0,'','',0)", list);
		System.out.println(row >= 1?"�����ɹ�":"����ʧ��");
	}
}
