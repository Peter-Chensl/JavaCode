package demo1;

public class Bus extends Vehicle {
	//ππ‘Ï
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String name, String id, int seatNum) {
		super(name, id);
		this.seatNum = seatNum;
	}

	// Ù–‘
	private int seatNum;

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	@Override
	public double getSumRent(int days) {
		// TODO Auto-generated method stub
		double money;
		if(this.seatNum <= 16) {
			money = 400 * days;
		}else{
			money = 600 * days;
		}
		return money;
	}

}
