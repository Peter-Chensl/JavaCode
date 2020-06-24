package homework;

public class demo7 {
	public static void main(String[] args) {
		int i = 100;
		for(;i < 999;i++) {
			int gewei = i % 10;
			int shiwei = i / 10 % 10;
			int baiwei = i /100;
			if(i == gewei * gewei*gewei + shiwei*shiwei*shiwei + baiwei*baiwei*baiwei) {
				System.out.println(i);
			}
		}
	}
}
