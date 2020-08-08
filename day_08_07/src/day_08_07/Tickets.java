package day_08_07;

public class Tickets implements Runnable {
	private int ticket = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticket > 0)
			{
				System.out.println(Thread.currentThread()+"出售第" + ticket--+"张票");
			}
		}
	}
}
