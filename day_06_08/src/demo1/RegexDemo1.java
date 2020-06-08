package demo1;

public class RegexDemo1 {
	public static void main(String[] args) {
		split1();
		replaceAll1();
	}
	/*
	 * ½«×Ö·û´®ÖÐµÄÊý×ÖÌæ»»µô
	 */
	public static void replaceAll1() {
		String str = " asvcj12346njhiu15498";
		str = str.replaceAll("[\\d+]", "#");
		System.out.println(str);
	}
	public static void split1() {
		/*String str = "12-25-36-98";
		String[] strArr = str.split("-");*/
		String str = "18 22 33 44 55";
		String[] strArr = str.split(" ");
		System.out.println(strArr.length);
		for(int i = 0;i < strArr.length;i++) {
			System.out.println(strArr[i]);
		}
	}
}
