package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasgSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("�����ƾ���ѧ");
		set.add("��ϢѧԺ");
		set.add("���1801");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
