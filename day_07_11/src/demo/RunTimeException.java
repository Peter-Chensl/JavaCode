package demo;
/*
 * 异常分为编译异常和运行时期异常
 * 编译异常：调用了抛出异常得方法，不处理编译失败(try catch)
 * 运行异常：抛出得异常是RunTimeException类，或者是
 * 运行异常得特点：
 * 方法内部抛出的异常是运行异常，new XXXException
 * 方法的声明上，不需要throws语句,调用者，不需要处理
 * 设计原因：
 * 运行异常，不能发生，如果发生了，需要程序员停止程序，修改源代码
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
	 * 定义一个方法，计算圆形的面积
	 */
	/*public static double getArea(Double r) throws Exception{
		if(r <= 0) {
			throw new Exception("圆形不存在！");
		}
		return r*r*Math.PI;
		
	}*/
		double d = getArea(-1.0);
		System.out.println(d);
	}
	public static double getArea(Double r){
		if(r <= 0) {
			throw new RuntimeException("圆形不存在！");
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
