package demo1;

public class demo {
	public static void main(String[] args){
		
		int[] arr = null;
		try {
			int i = getarray(arr);
			System.out.println(i);
		}catch(NullPointerException ex) {
			System.out.println(ex);
		}
		
	}
	public static int getarray(int[] arr) throws NullPointerException{
		if(arr == null) {
			throw new NullPointerException("传递的数组不存在！");
		}
		if(arr.length == 0){
			throw new NullPointerException("数组中没有任何元素！！");
			
		}
		int i = arr[arr.length-1];
		return i*2;
	}
}
