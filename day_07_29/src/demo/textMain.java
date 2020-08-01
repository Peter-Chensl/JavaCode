package demo;

public class textMain {
	public static void main(String[] args) {
		SubThread st = new SubThread();
		st.start();
		for(int i = 0;i < 50;i++) {
			System.out.println("main..."+ i);
		}
	}
}
