package com.springmvc.demo.contronller;

import javax.servlet.http.HttpServletRequest;

import com.springmvc.demo.model.User;
import com.springmvc.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	@RequestMapping(value="/main")
	public String start(){
		return "user/main";
	}
	@RequestMapping(value="/top")
	public String top(){
		return "user/top";
	}


	
	
	//@RequestMapping(params="method=saveuser")
	@RequestMapping(value="/saveUser")
	public String saveUser(@RequestParam("username") String name, User user){
		userService.insert(user);
		return "user/success";
	}
	
	@RequestMapping("/selectUserById")
	public String queryUser(HttpServletRequest req, @RequestParam("id") Integer id)
	{
		User user= userService.selectById(id);
		System.out.println("select user!!!:"+id+user.getUserName());
		req.setAttribute("userInfo", user);
		return "user/userInfo";
		
		//return "userInfo";
	}
}
