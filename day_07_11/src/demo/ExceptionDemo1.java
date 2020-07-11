package demo;
/*
 * 异常的处理方式：
 * try...cath..finally
 * 格式：
 * try{
 * 		被检测的代码
 * 		可能出现异常的代码
 * }catch(异常类名 变量){
 * 		异常处理方式
 * 		循环，判断，调用方法，变量
 * }finally{
 * 		必须要执行的代码
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
	 * 定义方法
	 * 使用tay catch
	 */
	public static int getArray(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException{
		if(null == arr) {
			throw new NullPointerException("数组不存在");
			
		}
		if(arr.length < 3) {
			throw new ArrayIndexOutOfBoundsException("数组中没有3索引！");
		}
		return arr[3] + 1;
	}
}
