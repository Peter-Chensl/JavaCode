package homework;

public class Test {
	public static void main(String[] args) {
		/*Student stu = new Student("林明",Gender.男,18,"10086");
		stu.print();*/
		Teacher ch = new Teacher("小明",Gender.女,18,10086);
		ch.print();
		ch.teach();
		
	}
}
