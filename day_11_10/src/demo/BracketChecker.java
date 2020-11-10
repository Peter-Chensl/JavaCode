package demo;

public class BracketChecker {
	private String input;
	public BracketChecker(String in) {
		input = in;
		// TODO Auto-generated constructor stub
	}
	public void check() {
		int stackSize = input.length();
		stackX thestack = new stackX(stackSize);
		for(int j = 0;j<input.length();j++) {
			char chx = input.charAt(j);
			switch(chx) {
			case '(':
			case '{':
			case '[':
				thestack.push(chx);
				break;
			case ')':
			case '}':
			case ']':
				if(!thestack.isEmpty()) {
					char ch = thestack.pop();
					if((chx == '}' && ch != '{')||(chx == ']' && ch != '[')||(chx == ')' && ch != '(')) {
						System.out.println("´íÎó£º"+ chx + "at" + j);
					}else {
						System.out.println("ÕýÈ·£¡");
					}
				}
				default:
					break;
			}
		}
		if(!thestack.isEmpty())
		{
			System.out.println("´íÎó£¡");
		}
	}
}
