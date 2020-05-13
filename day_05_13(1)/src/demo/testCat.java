package demo;

public class testCat {
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat.color);
		System.out.println(cat.strain);
		System.out.println(cat.price);
		System.out.println(cat.size);
		
		Cat cat2 = new Cat();
		System.out.println(cat2.color);
		
		Cat cat3 = cat;
		System.out.println(cat3.color);
		
		cat3.color = "°×É«";
		System.out.println(cat3.color);
		System.out.println(cat.color);
		System.out.println(cat2.color);
		
		cat.price = 100.0;
		System.out.println(cat.price);
		System.out.println(cat2.price);
		System.out.println(cat3.price);
	}
}
