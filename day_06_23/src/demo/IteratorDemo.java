package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * �����еĵ�����
 * ��ȡ������Ԫ�ط�ʽ
 * �ӿ�Iterator:��������
 * boolean hasNext()�жϼ����л���û�п��Ա�ȡ����Ԫ�أ����򷵻�true
 * next()ȡ�������е���һ��Ԫ��
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		Iterator<String> it = coll.iterator();
	
		while(it.hasNext()) {
		    String s = it.next();
			System.out.println(s);
		}
	}
}
