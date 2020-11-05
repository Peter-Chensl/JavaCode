package demo;

public class IntegerDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * Interger类中的静态方法parseInt(String s),返回基本数据类型
	 * 要求：字符串必须是数字格式的
	 */
	/*public static void function() {
		int i = Integer.parseInt("16");
		System.out.println(i/2);
	}*/
	/*
	 * Interger类中的静态方法parseInt(String s，int radix)
	 * 
	 */
	/*public static void function() {
		int i = Integer.parseInt("110",2);
		System.out.println(i);
	}*/
	/*Interger类中的静态方法toString();
	 * 
	 */
	/*public static void function() {
		int i = 10;
		String s = Integer.toString(10,2);
		System.out.println(s);
	}*/
	/*public static void function() {
	Integer in = new Integer("100");
	int i = in.intValue();
	System.out.println(i);
			
	}*/
	public static void function() {
		Integer in = 1;//Integer in = new Integer(1);
		System.out.println(in.toString());
		in = in +1;
	}
}
