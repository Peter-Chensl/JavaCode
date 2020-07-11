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
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int[] arr = new int [0];
		try {
			int i = getArray(arr);
			System.out.println(i);
		}catch(NullPointerException ex){
			System.out.println(ex);
		}catch(ArrayIndexOutOfBoundsException ar){
			System.out.println(ar);
		}
		
		System.out.println("Game Over!");
	}
	/*
	 * ���巽��
	 * ʹ��tay catch
	 */
	public static int getArray(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException{
		if(null == arr) {
			throw new NullPointerException("���鲻����");
			
		}
		if(arr.length < 3) {
			throw new ArrayIndexOutOfBoundsException("������û��3������");
		}
		return arr[3] + 1;
	}
}
