package demo;

public class TestPhone {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.sentMessage();
		p.showNum();
		
		AndroidPhone a = new AndroidPhone();
		a.showNum();
		a.call();
		a.sentMessage();
	}

}
