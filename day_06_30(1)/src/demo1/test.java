package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		//1.��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2.��ȡ����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","chl715480406");
			//3.Ԥ����׼��sql��䣩
			Scanner input = new Scanner(System.in);
			System.out.println("������dvd������");
			String name = input.next();
			System.out.println("������dvd�ļ۸�");
			double price = input.nextDouble();
			System.out.println("������dvd�ĳ�����");
			String publish = input.next();
			PreparedStatement ps = conn.prepareStatement("insert into dvd values(null,?,?,?,0,'',null,0)");
			ps.setString(1, name);
			ps.setDouble(2, price);
			ps.setString(3, publish);
			//4.ִ��
			int row = ps.executeUpdate();//ִ��sql:ֻ��	ִ����ɾ��		
			if(1 == row) {
				System.out.println("�����ɹ���");
			}else {
				System.out.println("����ʧ�ܣ�");
			}
			//5.�ͷ���Դ
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
