package demo1;

public class RegexDemo2 {
	public static void main(String[] args) {
		checkMail();
	}
	public static void checkMail(){
		String email = "715480406@qq.com";
		boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+\\.[a-z]+");
		System.out.println(b);
	}
}
