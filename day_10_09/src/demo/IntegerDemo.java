package demo;

public class IntegerDemo {
	public static void main(String[] args) {
		function();
	}
	/*
	 * Interger���еľ�̬����parseInt(String s),���ػ�����������
	 * Ҫ���ַ������������ָ�ʽ��
	 */
	/*public static void function() {
		int i = Integer.parseInt("16");
		System.out.println(i/2);
	}*/
	/*
	 * Interger���еľ�̬����parseInt(String s��int radix)
	 * 
	 */
	/*public static void function() {
		int i = Integer.parseInt("110",2);
		System.out.println(i);
	}*/
	/*Interger���еľ�̬����toString();
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
