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
	//ʵ��������������1.��2.���
	public Pet getPet(int typeId) {
		Pet pet = null;
		switch(typeId) {
		case 1:
			pet = new Dog("����","��ɫ","�л���԰Ȯ");
			break;
		case 2:
			pet = new Penguin("QQ","�ڰ�",Gender.Q��);
			break;
		}
		return pet;
	}
}
