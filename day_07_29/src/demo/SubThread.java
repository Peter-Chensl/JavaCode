package demo;

public class SubThread extends Thread {
	public void run() {
		for(int i = 0; i< 50;i++) {
			System.out.println("sun..." + i);
		}
	}
}
