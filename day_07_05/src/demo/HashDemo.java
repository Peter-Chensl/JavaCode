package demo;

public class HashDemo {
	public static void main(String[] args) {
		Person p = new Person();
		int i = p.hashCode();
		System.out.println(i);
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
	}
}
