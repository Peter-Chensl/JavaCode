package demo;
/*
 * �쳣��Ϊ�����쳣������ʱ���쳣
 * �����쳣���������׳��쳣�÷��������������ʧ��(try catch)
 * �����쳣���׳����쳣��RunTimeException�࣬������
 * �����쳣���ص㣺
 * �����ڲ��׳����쳣�������쳣��new XXXException
 * �����������ϣ�����Ҫthrows���,�����ߣ�����Ҫ����
 * ���ԭ��
 * �����쳣�����ܷ�������������ˣ���Ҫ����Աֹͣ�����޸�Դ����
 */

public class RunTimeException {
	public static void main(String[] args) {
		/*double d = 0.0;
		try {
		 d = getArea(5.0);
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println(d);
	}*/
	/*
	 * ����һ������������Բ�ε����
	 */
	/*public static double getArea(Double r) throws Exception{
		if(r <= 0) {
			throw new Exception("Բ�β����ڣ�");
		}
		return r*r*Math.PI;
		
	}*/
		double d = getArea(-1.0);
		System.out.println(d);
	}
	public static double getArea(Double r){
		if(r <= 0) {
			throw new RuntimeException("Բ�β����ڣ�");
		}
		return r*r*Math.PI;
			
	}
	public static void function() {
		int[] arr = {1,2,3};
		if(arr[5] > 100) {
			arr[5] = arr[5] /2;
		}else {
			arr[5] = arr[5] / 3;
		}
		
	}
}
