package demo1;

public class Test {
	public static void main(String[] args) {
		JavaEE java = new JavaEE();
		Network net = new Network();
		
		java.setName("����");
		java.setId("�з�001");
		
		net.setName("����");
		net.setId("ά��001");
		
		System.out.println(java.getId() + " " + java.getName());
		java.work();
		
		System.out.println(net.getId() + " " + net.getName());
		net.work();
	}
}
