package homework;

public class equalsString {
	public static void main(String[] args) {
		String s1 = "Hello java";
		String s2 ="Hello java";
		if(s1 == s2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		boolean b = s1.equals(s2);
		System.out.println(b);
	}
}
