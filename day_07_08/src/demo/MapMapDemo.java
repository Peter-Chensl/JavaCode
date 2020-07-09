package demo;

import java.util.HashMap;
import java.util.Iterator;import java.util.Map;
import java.util.Set;

public class MapMapDemo {
	public static void main(String[] args) {
		HashMap<String,String> javase = new HashMap<String,String>();
		HashMap<String,String> javaee = new HashMap<String,String>();
		javase.put("001","张三");
		javase.put("002","李四");
		
		javaee.put("001","王五");
		javaee.put("002","赵六");
		
		HashMap<String,HashMap<String,String>> xian = new HashMap<String, HashMap<String,String>>();
		xian.put("基础版",javase);
		xian.put("就业版",javaee);
		key(xian);
		System.out.println("=================");
		entry(xian);
	}
	public static void entry(HashMap<String, HashMap<String,String>> xian) {
		Set<Map.Entry<String, HashMap<String,String>>> classNameSet = xian.entrySet();
		Iterator<Map.Entry<String, HashMap<String,String>>> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()) {
			Map.Entry<String, HashMap<String,String>> classNameEntry = classNameIt.next();
			String classNameKey = classNameEntry.getKey();
			HashMap<String,String> classMap = classNameEntry.getValue();
			Set<Map.Entry<String, String>> studentSet = classMap.entrySet();
			Iterator<Map.Entry<String, String>> studentIt = studentSet.iterator();
			while(studentIt.hasNext()) {
				Map.Entry<String, String> studentEntry = studentIt.next();
				String numKey = studentEntry.getKey();
				String nameValue = studentEntry.getValue();
				System.out.println(classNameKey+"..."+ numKey+"..."+nameValue);
				
			}
			
		}
	}
	public static void key(HashMap<String,HashMap<String,String>> xian) {
		Set<String> classNameSet = xian.keySet();
		Iterator<String> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()) {
			String classNameKey = classNameIt.next();
			HashMap<String,String> classMap = xian.get(classNameKey);
			Set<String> studentNum = classMap.keySet();
			Iterator<String> studentIt = studentNum.iterator();
			while(studentIt.hasNext()) {
				String numKey = studentIt.next();
				String nameValue = classMap.get(numKey);
				System.out.println(classNameKey+"..."+numKey+"..."+nameValue);
			}
		}
	}
}
