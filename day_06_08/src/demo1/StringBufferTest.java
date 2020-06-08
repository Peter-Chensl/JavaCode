package demo1;

public class StringBufferTest {
	public static void main(String[] args) {
		int[] arr= {4,1,14,5,6,8,55,88};
		toString(arr);
	}
	public static void toString(int[] arr) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		
		for(int i = 0; i < arr.length;i++) {
			if(i==arr.length-1) {
				buffer.append(arr[i]).append("]");
			}else {
				buffer.append(arr[i]).append(",");
			}
		}
		System.out.println(buffer);
	}
}
