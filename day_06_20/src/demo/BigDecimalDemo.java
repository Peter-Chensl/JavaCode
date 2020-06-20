package demo;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		function();
	}
	public static void function() {
		BigDecimal b1 = new BigDecimal("1.03");
		BigDecimal b2 = new BigDecimal("2.01");
		
		BigDecimal bigAdd = b1.add(b2);
		System.out.println(bigAdd);
		
		BigDecimal bigSub = b1.subtract(b2);
		System.out.println(bigSub);
		
		BigDecimal bigMul = b1.multiply(b2);
		System.out.println(bigMul);
		
		BigDecimal bigDiv = b1.divide(b2,2,BigDecimal.ROUND_UP);
		System.out.println(bigDiv);
	}
}
