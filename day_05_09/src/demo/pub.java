package demo;

public class pub {
	public pub() {
		
	}
	public pub(int pubId,String pubName) {
		this.pubId = pubId;
		this.pubName = pubName;
	}
	int pubId = 202011;
	String pubName = "新华出版社";
	String pubAddress = "长宁大街276号";
	
	public void show() {
		System.out.println("出版社信息如下：");
		System.out.println("编号：" + pubId);
		System.out.println("出版社名称：" + pubName);
		System.out.print("出版社地址：" + pubAddress);
	}
}
