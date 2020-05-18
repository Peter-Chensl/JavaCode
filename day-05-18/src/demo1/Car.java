package demo1;

public class Car extends Vehicle {
	//构造
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String name, String id, Type type) {
		super(name, id);
		this.type = type;
	}

	//属性
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
		case 两厢:
			return 300*days;
		case 三厢:
			return 350*days;
		case 越野:
			return 500 * days;
		default :
			return 0;
		}
	}
}
