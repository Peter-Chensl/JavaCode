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
		System.out.printf("%d �����ĺ�Ϊ�� %f\n",m,sum);
		System.out.printf("%d ������ƽ��ֵ�� %f\n", m,sum);
	}
	}
