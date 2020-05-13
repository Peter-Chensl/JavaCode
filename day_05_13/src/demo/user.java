package demo;

public class user {
	//构造
	public user() {
		
	}
	public user(String uName,String password) {
		this.uName = uName;
		this.password = password;
	}
	//属性
	private String uName;
	private String password;
	
	//方法
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuName() {
		return uName;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getpassword() {
		return password;
	}

}
