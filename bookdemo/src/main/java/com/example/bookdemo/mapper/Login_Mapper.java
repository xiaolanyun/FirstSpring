package com.example.bookdemo.mapper;

import java.util.List;


import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import com.example.bookdemo.entity.Login;
/*
 * dio,操作数据库，只写接口，方法具体由mapper的配置文件实现
 */
@Mapper
public interface Login_Mapper {

	public List<Login> findLoginInfo();//查询
	public void deleteLogin(int ID);//删除
	public void insertLogin(Login login);//插入
	public void updateLogin(Login login);//更新
	
	public Login findByUSER(String t);//查询数据
	
	
}
