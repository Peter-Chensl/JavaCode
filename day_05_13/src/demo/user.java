package demo;

public class user {
	//����
	public user() {
		
	}
	public user(String uName,String password) {
		this.uName = uName;
		this.password = password;
	}
	//����
	private String uName;
	private String password;
	
	//����
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
