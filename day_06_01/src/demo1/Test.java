package demo1;

public class Test {
	public static void main(String[] args) {
		JavaEE java = new JavaEE();
		Network net = new Network();
		
		java.setName("张三");
		java.setId("研发001");
		
		net.setName("李四");
		net.setId("维护001");
		
		System.out.println(java.getId() + " " + java.getName());
		java.work();
		
		System.out.println(net.getId() + " " + net.getName());
		net.work();
	}
}
