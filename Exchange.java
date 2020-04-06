public class Exchange{
	public static void main(String[] args){
	String leftHand = "黑桃10",rightHand = "红心8",desk = "";
	System.out.println("张三左手拿的是"+leftHand+"\n张三右手拿的是"+rightHand);
	System.out.println("张三交换手中的纸牌");
	desk = leftHand;
	leftHand = rightHand;
	rightHand = desk;
	System.out.println("现在张三左手拿的是" + leftHand + "\n现在张三右手拿的是" + rightHand);
	}
}