package demo;
/*
 * Throwable���еķ���
 * 	Srting getMessage()	���쳣��Ϣ����ϸ����
 * 	String toString()	���쳣��Ϣ�ļ������
 * 	void printStackTrace()	���쳣��Ϣ׷�ٵ���׼�Ĵ�����
 */
public class ExceptionDemo4 {
	public static void main(String[] args) throws Exception{
		try {
			function();
		}catch(ArrayIndexOutOfBoundsException ex) {
			//System.out.println(ex.toString());
			ex.printStackTrace();
		}
	}
	public static void function() throws Exception{
		throw new Exception("�쳣��");
	}
}
