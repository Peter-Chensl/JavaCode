package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasgSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("西安财经大学");
		set.add("信息学院");
		set.add("软件1801");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
