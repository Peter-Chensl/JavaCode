package demo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
		link.add(123);
		link.add(44);
		link.add(33);
		link.add(66);
		link.add(11);
		System.out.println(link);
	}
}
