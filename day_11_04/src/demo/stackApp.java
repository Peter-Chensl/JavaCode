package demo;

public class stackApp {
	public static void main(String[] args) {
		stackX thestack = new stackX(10);
		thestack.push(10);
		thestack.push(20);
		while(!thestack.isempty())
		{
			long value = thestack.peak();
			thestack.pop();
			System.out.println(value);
		}
	}
}
