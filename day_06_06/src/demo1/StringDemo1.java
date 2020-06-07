package demo1;

public class StringDemo1 {
	public static void main(String[] args) {
		function();
		function1();
		function2();
		function3();
	}
	
	public static void function() {
		byte[] bytes = {-97 ,-98,-99,-100};
		String s = new String(bytes);
		System.out.println(s);
		
		byte[] bytes1 = {65,66,67,68,69};
		String s1 = new String(bytes1,1,1);
		System.out.println(s1);
	}
	
	public static void function1() {
		char [] ch = {'a','b','c','d','e','f'};
		String s = new String(ch);
		System.out.println(s);
		
		String s1 = new String(ch,1,4);
		System.out.println(s1);
	}
	public static void function2() {
		String s2 = "howareyou!.java";
		s2 = s2.substring(1, 5);
		System.out.println(s2);
		
		String s3 = "helloworld";
		s3 = s3.substring(1);
		System.out.println(s3);
		
		boolean b = s2.startsWith("how");
		System.out.println(b);
		
		boolean c = s2.endsWith(".java");
		System.out.println(c);
		
		int index = s2.indexOf('o');
		System.out.println(index);
		
		byte[] str = s2.getBytes();
		for(int i = 0;i < str.length;i++) {
			System.out.println(str[i]);
		}
		
		char[] ch =s2.toCharArray(); 
		for(int i = 0;i < ch.length;i++) {
			System.out.println(ch[i]);
			}
	}
		public static void function3(){
			String str1 = "abc";
			String str2 = "ABc";
			
			boolean b = str1.equalsIgnoreCase(str2);
			System.out.println(b);
	}
}
