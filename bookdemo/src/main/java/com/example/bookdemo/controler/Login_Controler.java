package com.example.bookdemo.controler;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookdemo.entity.Login;
import com.example.bookdemo.service.Login_Service;
import com.example.bookdemo.serviceimpl.Login_Serviceimpl;

@CrossOrigin(origins = "*")
@RestController
@EnableAutoConfiguration
public class Login_Controler {
//在这个类里面对于前面定义的方法进行测试显示
	@Autowired
	Login_Service login_service ;
	//Login_Serviceimpl login_serviceimpl=new Login_Serviceimpl();
	//查看所有数据
	@RequestMapping("/Login")
	public Object findLoginInfo()
    {
    	Map map=new HashMap();//创建一个哈希表
    	List<Login> logins=login_service.findLoginInfo();
    	map.put("logins",logins);//将数据放入哈希表
    	return map;
    }
	
	//插入数据
	//20  woshiceshide woshiceshide
	 @RequestMapping("/Login1")
	    public Object insertLoginInfo()
	    {
		    Login login = new Login();
		    login.setID(19);
		    login.setUSER("woshiceshide");
		    login.setPASSWORD("woshiceshide");	
		    login_service.insertLogin(login);
	    	return "插入数据操作成功";
	    	
	    }
	    //删除操作
	 //删除表第二行xiaolanyun
	    @RequestMapping("/Login2")
	    public Object deleteLoginInfo()
	    { 
	    	login_service.deleteLogin(2);
	    	return "删除数据操作成功";
	    }
	    //更新操作
	    @RequestMapping("/Login3")
	    public Object updateLogininfo()
	    {
	    	Login login =login_service.findByUSER("xiaolanyun");
	    	login.setUSER("xly");
	    	login_service.updateLogin(login);
	    	return "更新数据操作成功";
	    
	    }
	    
}
