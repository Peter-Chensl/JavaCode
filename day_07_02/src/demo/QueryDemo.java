package demo;

import java.util.List;

public class QueryDemo {
	public static void main(String[] args) {
		jdbcDemo1 jdbc = new jdbcDemo1();
		List<List<Object>> list = jdbc.query("select * from dvd", null);
		
		for(int i = 0; i < list.size();i++) {
			for(int j = 0;j < list.get(i).size();i++) {
				System.out.print(list.get(i).get(j) + "/t");
			}
			System.out.println();
		}
	}
}
