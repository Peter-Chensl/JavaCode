package demo2;
/*
 * ���ַ���������ĸת�ɴ�д����ΪСд
 */
public class HomeWork1 {
	public static void main(String[] args) {
		String str = "abghdAFDGHN";
		print(str);
	}
	public static void print(String str) {
		String first = str.substring(0, 1);
		String after = str.substring(1);
		
		first = first.toUpperCase();
		after = after.toLowerCase();
		
		System.out.println(first + after);
	}
}
