import java.util.Scanner;

//如果用户名等于"admin",密码等于123456，则输出欢迎您,admin,否则输出“对不起，密码错误，登录失败！”
public class StringCompare{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = input.next();
		System.out.println("\n请输入6位数密码：");
		String pass = input.next();
		if(name.equals("admin") && pass.equals("123456")){
			System.out.print("登录成功@！欢迎您，admin!");
		}else{
			System.out.print("登录失败，请检查您的账号和密码是否正确！");
		}
	}
}