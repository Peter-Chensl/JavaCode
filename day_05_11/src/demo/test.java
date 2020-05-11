package demo;

import java.util.*;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		while(input.hasNextDouble()) {
			double x = input.nextDouble();
			m += 1;
			sum += x;
			}
		System.out.printf("%d 个数的和为： %f\n",m,sum);
		System.out.printf("%d 个数的平均值是 %f\n", m,sum);
	}
	}
