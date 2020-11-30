package homework;

public class StringDemo {
	public static void main(String[] args) {
		String input = "www.google.com";
		System.out.println(input.length());
		int counto = 0;//记录o出现的个数
		int countg = 0;//记录g出现的个数
		for(int i =0;i<input.length();i++){
			if(input.charAt(i) == 'o'){
				counto++;
			}
			if(input.charAt(i) == 'g') {
				countg++;
			}
		}
		System.out.println("o出现的个数为："+ counto +" g出现的个数为：" + countg);
		String s = input.substring(input.indexOf('g'),input.indexOf('e'));
		System.out.println(s);
	}
}
