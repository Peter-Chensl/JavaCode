package demo1;

public class DeadLockDemo {
	public static void main(String[] args) {
		DeadLock dead = new DeadLock();
		Thread t0 = new Thread();
		Thread t1 = new Thread();
		t0.start();
		t1.start();
	}
}
