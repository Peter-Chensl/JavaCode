package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		array.add("123");
		array.add("456");
		
		set.add(789);
		set.add(890);
		
		iterator(array);
	}
	public static void iterator(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
