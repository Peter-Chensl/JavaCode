package demo;

public class Competer {
	public void openCompeter() {
		System.out.println("�ʼǱ�������");
	}
	public void closeCompeter() {
		System.out.println("�ʼǱ��ػ�");
	}
	
	public void useUSB(USB usb) {
		usb.open();
		usb.colse();
	}
}
