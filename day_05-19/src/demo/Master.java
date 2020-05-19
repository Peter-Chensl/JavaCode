package demo;

public class Master {
	/*public void feed(Dog dog) {
		dog.eat();
	}
	public void feed(Penguin guin) {
		// TODO Auto-generated method stub
		guin.eat();
	}*/
	public void feed(Pet pet) {
		pet.eat();
	}
	//实现主人领养宠物1.狗2.企鹅
	public Pet getPet(int typeId) {
		Pet pet = null;
		switch(typeId) {
		case 1:
			pet = new Dog("旺柴","红色","中华田园犬");
			break;
		case 2:
			pet = new Penguin("QQ","黑白",Gender.Q仔);
			break;
		}
		return pet;
	}
}
