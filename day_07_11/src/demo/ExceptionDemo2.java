package demo;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

/*
 * 多catch写在一起
 * 细节：
 * 		catch小括号中，写的是异常的类名
 * 		有顺序的概念
 * 		平级异常：抛出的异常类之间没有继承关系,没有顺序
 * 
 * 	存在上下级关系，则越高级的父类越得写到下面
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			
		}catch(NoSuchElementException ex) {
			
		}catch(NullPointerException ex) {
			
		}
	}
	public static void funcruon(int a) throws NullPointerException,NoSuchElementException{
		if(0 == a) {
			throw new NullPointerException();
		}
		if(1 == a) {
			throw new NoSuchElementException();
		}
	}
}
