package demo;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

/*
 * ��catchд��һ��
 * ϸ�ڣ�
 * 		catchС�����У�д�����쳣������
 * 		��˳��ĸ���
 * 		ƽ���쳣���׳����쳣��֮��û�м̳й�ϵ,û��˳��
 * 
 * 	�������¼���ϵ����Խ�߼��ĸ���Խ��д������
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
