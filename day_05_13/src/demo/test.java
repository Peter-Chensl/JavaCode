package demo;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Resign res = new Resign();
		for(int i = 1;i<=3;i++) {
			System.out.print("�������û�����");
			String uName = input.next();
			System.out.print("���������룺");
			String password = input.next();
			
			user us = new user(uName,password);
			if(res.login(us)) {
				System.out.print("��¼�ɹ���");
				break;
			}else if(3 == i){
				System.out.print("�Բ���û�л����ˣ���½ʧ�ܣ�");
				break;
			}else{
				System.out.println("��¼ʧ�ܣ�����"+(3-i)+"�λ���");
			}
		}
	}
}
