package com.example.bookdemo.service;

import java.util.List;

import com.example.bookdemo.entity.Login;

public interface Login_Service {
//定义接口，与serviceimpl真正调用mapper中的数据库操作方法
	
	public List<Login> findLoginInfo();//查询
	public void deleteLogin(int ID);//删除
	public void insertLogin(Login login);//插入
	public void updateLogin(Login login);//更新
	
	public Login findByUSER(String t);//查询数据
	
	

}
