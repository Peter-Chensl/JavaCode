public class Exchange{
	public static void main(String[] args){
	String leftHand = "����10",rightHand = "����8",desk = "";
	System.out.println("���������õ���"+leftHand+"\n���������õ���"+rightHand);
	System.out.println("�����������е�ֽ��");
	desk = leftHand;
	leftHand = rightHand;
	rightHand = desk;
	System.out.println("�������������õ���" + leftHand + "\n�������������õ���" + rightHand);
	}
}