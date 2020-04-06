/*温度的转换*/
public class Transfornation{
	public static void main(String[] args){
	double Fahrenheit = 100,Centigrade = 0;//定义华氏温度和摄氏温度
	Centigrade = 5/9.0*(Fahrenheit-32);
	System.out.println("当地温度为：" + Fahrenheit + "华氏温度" + Centigrade+"摄氏温度");
	}
}