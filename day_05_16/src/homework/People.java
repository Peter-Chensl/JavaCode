package homework;
/*
 * ʹ�÷�װ�ͼ̳�ʵ�����¹���
 * r���ࣺ
 * ���ԣ��������Ա�����
 * �������ҽ���
 * ѧ����̳�����
 * ����ѧ��
 * ������ѧϰ�ķ���
 * ��ʦ�� �̳�����
 * ���ԣ�����
 * ��������ѧ�ķ���
 * �����ࣺ
 * ����ѧ�����󣬵��÷���
 * ������ʦ���󣬵��÷���
 */
public class People {
	public People() {
		
	}
	
	public People(String name, Gender sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	private String name;
	private Gender sex;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println("��Һ�����");
		System.out.println("name:" +name);
		System.out.println("sex:" + sex);
		System.out.println("age:" + age);
	}

}
