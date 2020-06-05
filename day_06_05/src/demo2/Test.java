package demo2;

public class Test {
	public static void main(String[] args) {
		Jinli ji = new Jinli("小明", "董事会123465", 56421.25);
		ji.work();
		
		Fuwuyuan f1 = new Fuwuyuan("翠花","后勤001");
		Fuwuyuan f2 = new Fuwuyuan("酸菜","后勤002");
		f1.services();
		f1.work();
		
		ChuShi c = new ChuShi("老干妈", "厨001");
		c.work();
		c.services();
	}
}
