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
		System.out.println("请输入两个整数：");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("交换之前：" + "num1=" + num1 + ",num2=" +num2 );
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("交换之后：" + "num1=" + num1 + ",num2=" +num2 );
	}
}
