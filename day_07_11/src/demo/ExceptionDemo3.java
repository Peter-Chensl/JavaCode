package demo;
/*
 * �쳣�Ĵ���ʽ��
 * try...cath..finally
 * ��ʽ��
 * try{
 * 		�����Ĵ���
 * 		���ܳ����쳣�Ĵ���
 * }catch(�쳣���� ����){
 * 		�쳣����ʽ
 * 		ѭ�����жϣ����÷���������
 * }finally{
 * 		����Ҫִ�еĴ���
 * }
 * 
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		try {
			function(0);
		}catch(Exception ex) {
			System.out.println(ex);
		}finally {
			System.out.println("�������ִ�У�");
		}
	}
	public static void function(int a) throws Exception {
		if(0 == a) {
			throw new Exception();
		}
		System.out.println(a);
	}
}
