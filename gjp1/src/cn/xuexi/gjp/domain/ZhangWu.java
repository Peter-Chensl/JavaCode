package cn.xuexi.gjp.domain;

public class ZhangWu {
	private int zwid;
	private String flname;
	private double money;
	private String zhanghu;
	private String createtime;
	private String descrition;
	public ZhangWu() {
		
	}
	public ZhangWu(int zwid, String flname, double money, String zhanghu, String createtime, String descrition) {
		
		this.zwid = zwid;
		this.flname = flname;
		this.money = money;
		this.zhanghu = zhanghu;
		this.createtime = createtime;
		this.descrition = descrition;
	}
	@Override
	public String toString() {
		return "Zhangwu [zwid=" + zwid + ", flname=" + flname + ", money=" + money + ", zhanghu=" + zhanghu
				+ ", createtime=" + createtime + ", descrition=" + descrition + "]";
	}
	public int getZwid() {
		return zwid;
	}
	public void setZwid(int zwid) {
		this.zwid = zwid;
	}
	public String getFlname() {
		return flname;
	}
	public void setFlname(String flname) {
		this.flname = flname;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getZhanghu() {
		return zhanghu;
	}
	public void setZhanghu(String zhanghu) {
		this.zhanghu = zhanghu;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	
	
}
