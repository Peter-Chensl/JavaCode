/*package demo;

public class BracketChecker {
	private String input;
	public BracketChecker(String in) {
		input = in;
		// TODO Auto-generated constructor stub
	}
	public void check() {
		int stackSize = input.length();
		stackX thestack = new stackX(stackSize);
		for(int j = 0;j<input.length();j++) {
			char chx = input.charAt(j);
			switch(chx) {
			case '(':
			case '{':
			case '[':
				thestack.push(chx);
				break;
			case ')':
			case '}':
			case ']':
				if(!thestack.isEmpty()) {
					char ch = thestack.pop();
					if((chx == '}' && ch != '{')||(chx == ']' && ch != '[')||(chx == ')' && ch != '(')) {
						System.out.println("错误："+ chx + "at" + j);
					}else {
						System.out.println("正确！");
					}
				}
				default:
					break;
			}
		}
		if(!thestack.isEmpty())
		{
			System.out.println("错误！");
		}
	}
}*/
//if���ʵ��
import javax.swing.JOptionPane;

public class BracketChecker {
   public static void main( String args[] ){
      String firstNumber,   //�洢��1����������
             secondNumber,  //�洢��2����������
             result;        //�ַ������
      int number1,          //�����Ƚϵĵ�1��int������ 
          number2;          //�����Ƚϵĵ�2��int������
      //���ַ�����ʽ����������
      firstNumber =
         JOptionPane.showInputDialog( "�������1������:" );
      secondNumber =
         JOptionPane.showInputDialog( "�������2������:" );          
      //���ַ���ת��Ϊint����
     //*********Found********
      number1 = Integer.parseInt( firstNumber);
      number2 = Integer.parseInt( secondNumber );
      //�ÿ��ַ�����ʼ���������
      result = "";
      if ( number1 == number2 )
         result = number1 + " == " + number2;
      if ( number1 != number2 )
         result = number1 + " != " + number2;
      if ( number1 < number2 )
         result = result + "\n" + number1 + " < " + number2;
      if ( number1 > number2 )
         result = result + "\n" + number1 + " > " + number2;
      if ( number1 <= number2 )
         result = result + "\n" + number1 + " <= " + number2;
      if ( number1 >= number2 )
         result = result + "\n" + number1 + " >= " + number2;
      //��ʾ���String
      /*JOptionPane.showMessageDialog(
         null, result, "�ȽϽ��");*/
     //*********Found********
        // JOptionPane.showMessageDialog(null,result,-1));
      System.exit( 0 );
   }
}


