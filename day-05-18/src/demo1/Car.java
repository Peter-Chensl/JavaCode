package demo1;

public class Car extends Vehicle {
	//����
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String name, String id, Type type) {
		super(name, id);
		this.type = type;
	}

	//����
	private Type type;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public double getSumRent(int days) {
		// TODO Auto-generated method stub
		switch(this.type) {
		case ����:
			return 300*days;
		case ����:
			return 350*days;
		case ԽҰ:
			return 500 * days;
		default :
			return 0;
		}
	}
}
