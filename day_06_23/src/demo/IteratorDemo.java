package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合中的迭代器
 * 获取集合中元素方式
 * 接口Iterator:两个方法
 * boolean hasNext()判断集合中还有没有可以被取出的元素，有则返回true
 * next()取出集合中的下一个元素
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		Iterator<String> it = coll.iterator();
	
		while(it.hasNext()) {
		    String s = it.next();
			System.out.println(s);
		}
	}
}
