package homework;

public class Stringlianjie {
	public static void main(String[] args) {
		//String����
		String s1 = "hello ";
		String s2 = "world";
		System.out.println(s1+s2);
		//StringBuffer����
		StringBuffer buf = new StringBuffer();
		buf.append("hello ").append("world");
		System.out.println(buf);
	}
}
