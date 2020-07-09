package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		function();
	}
	public static void function() {
		List<String> list = new ArrayList<String>();
		list.add("esdjh");
		list.add("qusdfhj");
		list.add("bv");
		list.add("weg");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
