package demo;

public class Teacher {
	public void menu() {
		System.out.println("**********************");
		System.out.println("*    1.激光打印机                          *");
		System.out.println("*    2.喷墨打印机                          *");
		System.out.println("**********************");
	}
	public void user(PrintC p ) {
		p.print();
	}
}
