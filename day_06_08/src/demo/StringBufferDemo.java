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
	 * 将缓冲区内得的所有字符变成一个字符串
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
	 * 将缓冲区的字符反转
	 */
	public static void function4() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		
		buffer.reverse();
		System.out.println(buffer);
	}
	/*
	 * replace
	 * 将指定内容的所有字符替换成指定内容
	 */
	public static void function3() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		
		buffer.replace(1, 4, "an");
		System.out.println(buffer);
	}
	/*
	 * insert
	 * 将任意类型的数据插入到缓冲区索引上
	 */
	public static void function2() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdef");
		
		buffer.insert(3, 9);
		System.out.println(buffer);
	}
	/*
	 * delete
	 * 删除缓冲区中给的字符
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
