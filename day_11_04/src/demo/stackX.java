package demo;

public class stackX {
	private int maxSize;
	private long[] array;
	private int top;
	public stackX(int max) {
		maxSize = max;
		array = new long[maxSize];
		top = -1;
	}
	public void push(long x)
	{
		array[++top] = x;
	}
	public long pop()
	{
		return array[top--];
	}
	public long peak()
	{
		return array[top];
	}
	public boolean isempty()
	{
		return top == -1;
	}
	public boolean ifFull()
	{
		return top == maxSize;
	}
}
