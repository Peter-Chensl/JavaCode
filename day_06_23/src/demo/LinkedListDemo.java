package demo;

import java.util.LinkedList;

/*
 * 
 * LinkedList 链表集合的特有功能
 * 自身特点：链表底层实现，查询慢，增删快 
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		function();
		function1();
		function2();
	}
	public static void function2() {
		LinkedList<String> link = new LinkedList<String>();
		link.addFirst("1");
		link.addFirst("2");
		link.addFirst("3");
		
		String first = link.getFirst();
		String last = link.getLast();
		System.out.println(first);
		System.out.println(last);
	}
	public static void function1() {
		LinkedList<String> link = new LinkedList<String>();
		link.addLast("a");
		link.addLast("b");
		link.addLast("c");
		link.addLast("d");
		link.addLast("e");
		
		link.addFirst("1");
		link.addFirst("2");
		link.addFirst("3");
		System.out.println(link);
	}
	public static void function() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("abc");
		link.add("bcd");
		
		link.addFirst("123");
		System.out.println(link);
		
		link.addLast("456");
		System.out.println(link);
	}
}
