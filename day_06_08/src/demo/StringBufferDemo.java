package demo;

public class StringBufferDemo {
	public static void main(String[] args) {
		function();
		function1();
		function2();
		function3();
		function4();
		function5();
	}
	/*
	 * toString()
	 * ���������ڵõ������ַ����һ���ַ���
	 */
	public static void function5() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		buffer.append(12345);
		
		String s = buffer.toString();
		System.out.println(s);
	}
	/*
	 * reverse()
	 * �����������ַ���ת
	 */
	public static void function4() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		
		buffer.reverse();
		System.out.println(buffer);
	}
	/*
	 * replace
	 * ��ָ�����ݵ������ַ��滻��ָ������
	 */
	public static void function3() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		
		buffer.replace(1, 4, "an");
		System.out.println(buffer);
	}
	/*
	 * insert
	 * ���������͵����ݲ��뵽������������
	 */
	public static void function2() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		
		buffer.insert(3, 9);
		System.out.println(buffer);
	}
	/*
	 * delete
	 * ɾ���������и����ַ�
	 */
	public static void function1() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("asjfh");
		
		buffer.delete(0, buffer.length());
		System.out.println(buffer);
		
	}
	public static void function() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(6);
		System.out.println(buffer);
		
		
	}
}
