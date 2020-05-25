package demo;

public class Shop {
	String macBrand = "MacBookAir";
	double macSize = 13.3;
	double macPrice = 6988.88;
	int macCount = 5;
	
	String thinkBrand = "ThinkPadt450";
	double thinkSize = 14;
	double thinkPrice = 5999.99;
	int thinkCount = 10;
	
	String asusBrand = "ASUS-FL5800";
	double asusSize = 15.6;
	double asusPrice = 4999.9;
	int asusCount = 18;
	
	int totalCount = macCount + thinkCount + asusCount;
	double totalMoney = macPrice * macCount + thinkCount * thinkPrice + asusPrice * asusCount;
	
	public void print() {
		System.out.println("-------------商品信息----------------");
		System.out.println("品牌 \t                             尺寸\t     价格\t    库存量");
		System.out.println(macBrand + "      " + macSize + "     " + macPrice + "  " + macCount);
		System.out.println(thinkBrand + "    " + thinkSize + "     " + thinkPrice + "  " + thinkCount);
		System.out.println(asusBrand + "     " + asusSize + "     " + asusPrice + "   " + asusCount );
		
		System.out.println("总库存量：" + totalCount);
		System.out.println("商品库存总金额：" + totalMoney);
	}
}
