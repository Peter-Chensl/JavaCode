/**
 * 
 */
package homework;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class demo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������������");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("����֮ǰ��" + "num1=" + num1 + ",num2=" +num2 );
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("����֮��" + "num1=" + num1 + ",num2=" +num2 );
	}
}