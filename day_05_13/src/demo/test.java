package demo;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Resign res = new Resign();
		for(int i = 1;i<=3;i++) {
			System.out.print("请输入用户名：");
			String uName = input.next();
			System.out.print("请输入密码：");
			String password = input.next();
			
			user us = new user(uName,password);
			if(res.login(us)) {
				System.out.print("登录成功！");
				break;
			}else if(3 == i){
				System.out.print("对不起，没有机会了，登陆失败！");
				break;
			}else{
				System.out.println("登录失败！还有"+(3-i)+"次机会");
			}
		}
	}
}
