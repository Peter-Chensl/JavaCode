package demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		function();
		function1();
		function2();
		function3();
	}
	private static void function3() {
		// TODO Auto-generated method stub
		Collection<String> coll = new ArrayList<String>();
		coll.add("abg");
		coll.add("itcast");
		coll.add("money");
		System.out.println(coll);
		
		boolean b = coll.remove("money");
		System.out.println(b);
		System.out.println(coll);
	}
	private static void function2() {
		// TODO Auto-generated method stub
		Collection<String> coll = new ArrayList<String>();
		coll.add("abg");
		coll.add("itcast");
		coll.add("money");
		
		Object[] obj = coll.toArray();//�Ѽ����е�Ԫ��ת��Ϊ���飬����ֵΪObject����
		for(int i = 0 ; i< obj.length; i++) {
			System.out.println(obj[i]);
		}
		
	}
	private static void function1() {
		// TODO Auto-generated method stub
		Collection<String> coll = new ArrayList<String>();
		coll.add("abg");
		coll.add("itcast");
		coll.add("money");
		
		boolean b = coll.contains("abg");//���Ҽ������Ƿ��и�Ԫ��
		System.out.println(b);
		
	}
	public static void function() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc");
		coll.add("bcd");
		System.out.println(coll);
		
		coll.clear();//��������е�����Ԫ��
		System.out.println(coll);
	}
	
}
