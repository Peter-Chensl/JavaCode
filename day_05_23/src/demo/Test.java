package demo;

public class Test {
	public static void main(String[] args) {
		USB mouse = new Mouse();
		mouse.service();
		
		USB U = new UDisk();
		U.service();
	}
}
