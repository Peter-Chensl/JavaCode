package demo;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		function();
	}
	public static void function() {
		BigInteger b1 = new BigInteger("65546874547845787578");
		BigInteger b2 = new BigInteger("345654758673547657687693");
		
		BigInteger bigAdd = b1.add(b2);
		System.out.println(bigAdd);
		
		BigInteger bigSub = b1.subtract(b2);
		System.out.println(bigSub);
		
		BigInteger bigMul = b1.multiply(b2);
		System.out.println(bigMul);
		
		BigInteger bigDiv = b1.divide(b2);
		System.out.println(bigDiv);
	}
}
