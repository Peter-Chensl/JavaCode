package homework;

public class StringDemo {
	public static void main(String[] args) {
		String input = "www.google.com";
		System.out.println(input.length());
		int counto = 0;//��¼o���ֵĸ���
		int countg = 0;//��¼g���ֵĸ���
		for(int i =0;i<input.length();i++){
			if(input.charAt(i) == 'o'){
				counto++;
			}
			if(input.charAt(i) == 'g') {
				countg++;
			}
		}
		System.out.println("o���ֵĸ���Ϊ��"+ counto +" g���ֵĸ���Ϊ��" + countg);
		String s = input.substring(input.indexOf('g'),input.indexOf('e'));
		System.out.println(s);
	}
}
