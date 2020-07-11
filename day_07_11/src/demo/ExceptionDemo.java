package demo;

public class ExceptionDemo {
	
	public static void main(String[] args) throws Exception{
		int[] arr = null;
		int i = getArray(arr);
		System.out.println(i);
	}
	public static int getArray(int[] arr) throws Exception {
		if(arr == null) {
			throw new Exception("传递的数组不存在！");
		}
		//判断数组中是不是有元素
		if(0 == arr.length) {
			//抛出异常，告诉调用者数组没有元素
			throw new Exception("数组中没有任何元素！");
		}
		int i = arr[arr.length-1];
		return i*2;
	}
}
