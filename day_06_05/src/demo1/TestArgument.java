package demo1;

public class TestArgument {
	public static void main(String[] args) {
		Student s = new Student();
		noSmoking(s);
	}
	
	public static void noSmoking(Smoking s) {
		s.smoking();
	}

}
