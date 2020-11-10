package demo;

public class stackX {
	private int maxSize;
	private char[] stackArray;
	private int top;
	public stackX(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
		// TODO Auto-generated constructor stub
	}
	public void push(char ch) {
		stackArray[++top] = ch;
	}
	public char pop() {
		return stackArray[top--];
	}
	public char peek()
	{
		return stackArray[top];
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
}
