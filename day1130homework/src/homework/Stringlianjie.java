package homework;

public class Stringlianjie {
	public static void main(String[] args) {
		//String连接
		String s1 = "hello ";
		String s2 = "world";
		System.out.println(s1+s2);
		//StringBuffer连接
		StringBuffer buf = new StringBuffer();
		buf.append("hello ").append("world");
		System.out.println(buf);
	}
}
