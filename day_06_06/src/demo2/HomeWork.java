package demo2;

/*
 * ��ȡָ���ַ����д�д��ĸ��Сд��ĸ�����ֵĸ���
 */
public class HomeWork {
	public static void main(String[] args) {
		String str  = "SFGFGDkjhks1254";
		getCount(str);
	}
	public static void getCount(String str) {
		int countUpper = 0;
		int countLower = 0;
		int countDigit = 0;
		
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c >= 65 && c <= 90) {
				countUpper++;
			}else if(c >= 97 && c <= 128) {
				countLower++;
			}else {
				countDigit++;
			}
		}
		System.out.println(countUpper + " "+ countLower + " "+ countDigit);
	}
}
