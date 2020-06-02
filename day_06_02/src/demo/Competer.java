package demo;

public class Competer {
	public void openCompeter() {
		System.out.println("笔记本开机！");
	}
	public void closeCompeter() {
		System.out.println("笔记本关机");
	}
	
	public void useUSB(USB usb) {
		usb.open();
		usb.colse();
	}
}
