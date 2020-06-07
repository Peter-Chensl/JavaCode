package demo2;
/*
 * 把字符串中首字母转成大写其余为小写
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
