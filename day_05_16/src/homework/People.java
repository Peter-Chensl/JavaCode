package homework;
/*
 * 使用封装和继承实现以下功能
 * r人类：
 * 属性：姓名，性别，年龄
 * 方法自我介绍
 * 学生类继承人类
 * 属性学号
 * 方法：学习的方法
 * 教师类 继承人类
 * 属性：工资
 * 方法：教学的方法
 * 测试类：
 * 创建学生对象，调用方法
 * 创建教师对象，调用方法
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
		System.out.println("大家好我是");
		System.out.println("name:" +name);
		System.out.println("sex:" + sex);
		System.out.println("age:" + age);
	}

}
