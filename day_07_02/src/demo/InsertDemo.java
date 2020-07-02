package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] args) {
		jdbcDemo1 jdbc = new jdbcDemo1();
		Scanner sc = new Scanner(System.in);
		List<Object> list = new ArrayList<Object>();
		System.out.println("请输入dvd的名称");
		list.add(sc.next());
		System.out.println("请输入dvd的价格");
		list.add(sc.nextDouble());
		System.out.println("请输入dvd的出版商");
		list.add(sc.next());
		int row = jdbc.update("insert into dvd values(null,?,?,?,0,'','',0)", list);
		System.out.println(row >= 1?"新增成功":"新增失败");
	}
}
