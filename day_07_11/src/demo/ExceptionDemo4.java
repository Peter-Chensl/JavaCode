package demo;
/*
 * Throwable类中的方法
 * 	Srting getMessage()	对异常信息的详细描述
 * 	String toString()	对异常信息的简短描述
 * 	void printStackTrace()	将异常信息追踪到标准的错误流
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
		throw new Exception("异常了");
	}
}
