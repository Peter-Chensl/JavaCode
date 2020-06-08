package demo1;

public class RegexDemo {
	public static void main(String[] args) {
		checkQQ();
		checkPhone();
	}
	public static void checkQQ() {
		String QQ = "22345";
		boolean b = QQ.matches("[1-9][0-9]{4,9}");
		System.out.println(b);
	}
	public static void checkPhone() {
		String teNumber = "15121498074";
		boolean b = teNumber.matches("1[34857][\\d]{9}");
		System.out.println(b);
	}
}
