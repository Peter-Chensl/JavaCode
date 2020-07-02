package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class updateDemo {
	public static void main(String[] args) {
		jdbcDemo1 jdbc = new jdbcDemo1();
		Scanner sc = new Scanner(System.in);
		List<Object> list = new ArrayList<Object>();
		System.out.println("ÇëÊäÈë½èÔÄÈÊµÄĞÕÃû");
		list.add(sc.next());
		System.out.println("ÇëÊäÈë½èÔÄÈÕÆÚ");
		list.add(sc.next());
		System.out.println("ÇëÊäÈëdvd±àºÅ");
		list.add(sc.nextInt());
		int row = jdbc.update("update dvd set state = 1,borname = ?,borDate = ?,times = times+1 where id = ?", list);
		System.out.println(row >= 1?"½èÔÄ³É¹¦£¡" : "½èÔÄÊ§°Ü£¡");
	}
}
