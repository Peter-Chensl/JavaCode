/*数字加密*/
public class Encryption{
	public static void main(String[] args){
	int num = 100;//需要加密的数字
	double temp = (num*10+5)/2 + 3.14159;//定义一个中间变量，进行加密操作
	int result = (int)temp;
	System.out.println("原来的数字为：" + num + "\n加密后的数字为：" + result);
		}
}