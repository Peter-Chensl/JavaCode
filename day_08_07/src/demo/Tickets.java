package demo;

public class Tickets implements Runnable {
	private int ticket = 100;
	private Object obj = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			payTickets();
		}
	}
	private synchronized void payTickets()
	{
			if(ticket > 0)
			{
				try {
					Thread.sleep(10);
				}catch(Exception ex) {}
				System.out.println(Thread.currentThread() + "³öÊÛµÚ" + ticket--);
			}
	}
	
}
