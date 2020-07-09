package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {
	public static void main(String[] args) {
		function();
		function1();
		function2();
		function3();
		function4();
	}
	public static void function4() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		Iterator<Map.Entry<Integer,String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,String> entry = it.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"..."+value);
		}
	}
	public static void function3() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("a",11);
		map.put("b",11);
		map.put("c",13);
		map.put("d",14);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key+"..."+value);
		}
	}
	/*
	 * 移除
	 */
	public static void function2() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		System.out.println(map);
		
		String value = map.remove(3);
		System.out.println(value);
		System.out.println(map);
	}
	/*
	 * 通过键对象，获取值对象
	 */
	public static void function1() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		System.out.println(map);
		
		String value = map.get(3);
		System.out.println(value);
		
	}
	public static void function() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		Integer i = map.put("a", 1);
		System.out.println(i);
		map.put("b", 2);
		map.put("c", 3);
		System.out.println(map);
	}
}
