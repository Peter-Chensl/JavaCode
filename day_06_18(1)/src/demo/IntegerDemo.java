package demo;

public class IntegerDemo {
	public static void main(String[] args) {
		function();
		function1();
		function2();
		function3();
		function4();
	}
	/*
	 * Integer类做进制转换
	 */
	public static void function4() {
		System.out.println(Integer.toBinaryString(99));//二进制
		System.out.println(Integer.toOctalString(99));//八进制
		System.out.println(Integer.toHexString(99));//十六进制
		
	}
	public static void function3() {
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}
	
	public static void function2() {
		int i = 3;
		String s = i + "";
		System.out.println(s+1);
	}
	/*
	 * Ineger类中静态方法parseInt(String s)返回基本数据类型
	 * 要求：字符串必须是数字格式的
	 */
	public static void function() {
		int i = Integer.parseInt("12");
		System.out.println(i/2);
	}
	
	/*
	 * Integer静态方法parseInt(String s,int radix)
	 * radix 基数,进制，但是方法的结果是十进制
	 */
	public static void function1() {
		int i = Integer.parseInt("110", 10
				);
		System.out.println(i);
	}
}
