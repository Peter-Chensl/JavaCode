package demo;

public class ExceptionDemo {
	
	public static void main(String[] args) throws Exception{
		int[] arr = null;
		int i = getArray(arr);
		System.out.println(i);
	}
	public static int getArray(int[] arr) throws Exception {
		if(arr == null) {
			throw new Exception("���ݵ����鲻���ڣ�");
		}
		//�ж��������ǲ�����Ԫ��
		if(0 == arr.length) {
			//�׳��쳣�����ߵ���������û��Ԫ��
			throw new Exception("������û���κ�Ԫ�أ�");
		}
		int i = arr[arr.length-1];
		return i*2;
	}
}
