package demo;

public class Dog  extends Pet{
	/*public Dog() {
		System.out.println("ִ��Dog���޲ι��췽��");
	}
	public Dog(String strain,double size) {
		this.strain = strain;
		this.size = size;
		System.out.println("ִ��Dog����������������췽��");
	}
	public Dog(String name,String color,String strain,double size) {
		this.color = color;
		this.name = name;
		this.size = size;
		this.strain = strain;
		System.out.println("ִ��Dog����ĸ������Ĺ��췽��");
	}*/
	public Dog() {
		//super();//ָ�����ø�����޲ι��췽��
		super("����","��ɫ");//ָ�����ø���Ĵ��ι��췽��
		System.out.println("ִ��Dog���޲ι��췽��");
	}
	public Dog(String strain,double size) {
		this.strain = strain;
		this.size = size;
		System.out.println("ִ��Dog����������������췽��");
	}
	public Dog(String name,String color,String strain,double size) {
		this.color = color;
		this.name = name;
		this.size = size;
		this.strain = strain;
		System.out.println("ִ��Dog����ĸ������Ĺ��췽��");
	}
	String strain;
	double size;
}
