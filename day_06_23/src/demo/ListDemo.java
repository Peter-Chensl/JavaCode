package demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		function();
		function1();
		function2();
	}
	public static void function2() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Integer i = list.set(0,5);
		System.out.println(i);
		System.out.println(list);
	}
	/*
	 * remove(int index)
	 * 移除指定索引上的元素
	 */
	public static void function1() {
		List<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		System.out.println(list);
		
		double re = list.remove(1);//返回被删除的元素
		System.out.println(re);
		System.out.println(list);
	}
	public static void function() {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);
		
		list.add(0,"abc0");
		System.out.println(list);
	}
}
