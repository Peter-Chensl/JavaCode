package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginDemo {
	public static void main(String[] args) {
		//1.��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2.��ȡ����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dvdsys","root","chl715480406");
			//3.Ԥִ��
			Scanner input = new Scanner(System.in);
			System.out.println("�������û���");
			String name = input.next();
			System.out.println("����������");
			String password = input.next();
			PreparedStatement ps = conn.prepareStatement("select * from users where username = ? and password = ?");
			ps.setString(1, name);
			ps.setString(2,password);
			//ִ��executeUpdate(��ɾ��),executeQuery(��)
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("��¼�ɹ���");
				if(0 == rs.getInt(4)) {
					System.out.println("��ͨ�û����鿴dvd,����dvd���黹dvd,���а�");
				}else {
					System.out.println("����Ա������dvd,ɾ��dvd,�鿴dvd,���а�");
				}
			}else{
				System.out.println("��¼ʧ�ܣ�");
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
