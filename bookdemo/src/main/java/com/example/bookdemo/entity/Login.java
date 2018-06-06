package com.example.bookdemo.entity;

/*
 * 将数据库中属性映射到代码中
 */
public class Login {
	private int ID;
	private String USER;
	private String PASSWORD;
	
	//进行get,set方法，右键自动导入
	public long getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUSER() {
		return USER;
	}
	public void setUSER(String uSER) {
		USER = uSER;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

}
