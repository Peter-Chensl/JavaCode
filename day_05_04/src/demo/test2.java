package demo;

public class test2 {
//输出2000-2017中所有的闰年
	public static boolean isflag(int year) {
		return (year % 100 != 0 &&year % 4 == 0 || year % 400 == 0);
	}
	public static void print() {
		for(int i = 2000;i <= 2017;i++) {
			if(isflag(i)) {
				System.out.print(i + " ");
			}
			
		}
	}
	public static void main(String[] args) {
		print();
	}
}
