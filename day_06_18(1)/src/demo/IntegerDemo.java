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
	 * Integer��������ת��
	 */
	public static void function4() {
		System.out.println(Integer.toBinaryString(99));//������
		System.out.println(Integer.toOctalString(99));//�˽���
		System.out.println(Integer.toHexString(99));//ʮ������
		
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
	 * Ineger���о�̬����parseInt(String s)���ػ�����������
	 * Ҫ���ַ������������ָ�ʽ��
	 */
	public static void function() {
		int i = Integer.parseInt("12");
		System.out.println(i/2);
	}
	
	/*
	 * Integer��̬����parseInt(String s,int radix)
	 * radix ����,���ƣ����Ƿ����Ľ����ʮ����
	 */
	public static void function1() {
		int i = Integer.parseInt("110", 10
				);
		System.out.println(i);
	}
}
