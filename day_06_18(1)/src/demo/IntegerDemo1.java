package demo;

public class IntegerDemo1 {
	public static void main(String[] args) {
		function();
	}
	public static void function() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);
		System.out.println(i.equals(j));
		
		Integer a = 128;
		Integer b = 128;
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		Integer aa = 127;
		Integer bb =127;
		System.out.println(aa==bb);
		System.out.println(aa.equals(bb));
	}
}
