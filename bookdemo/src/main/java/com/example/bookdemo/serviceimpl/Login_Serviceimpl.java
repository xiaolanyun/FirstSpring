package com.example.bookdemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookdemo.entity.Login;
import com.example.bookdemo.mapper.Login_Mapper;
import com.example.bookdemo.service.Login_Service;

@Service
public class Login_Serviceimpl implements Login_Service{

	@Autowired
	//接口不能实例化对象，但是可以创造接口变量，引用作用
    Login_Mapper login_mapper;
    @Override
    public List<Login> findLoginInfo(){
    	// TODO Auto-generated method stub
    	return login_mapper.findLoginInfo();
    }
	@Override
	public void deleteLogin(int ID){
		// TODO Auto-generated method stub
		login_mapper.deleteLogin(ID);
	}
	@Override
	public void updateLogin(Login login) {
		// TODO Auto-generated method stub
		login_mapper.updateLogin(login);
	}
	@Override
	public void insertLogin(Login login) {
		// TODO Auto-generated method stub
		login_mapper.insertLogin(login);
	}
	@Override
	public Login findByUSER(String t) {
		// TODO Auto-generated method stub
		return login_mapper.findByUSER(t);
	}
	
}
