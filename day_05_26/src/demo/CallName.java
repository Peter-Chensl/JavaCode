package demo;

import java.util.Random;

public class CallName {
	public void print(){
		String[] name = {"张三","李四","李红","王伽","陈会","龙井","赵家","孙继海"};
		
		for(int i = 0;i < name.length;i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		System.out.println("============================================");
		
		Random ran = new Random();
		
		int index = ran.nextInt(name.length);
		System.out.println(name[index]);
	}
}
