package com.mahout.demo.service;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.mahout.demo.utils.MD5Util;
import com.mahout.demo.utils.UUIDGenerator;
import com.mahout.demo.common.AbstractTest;
import com.mahout.demo.model.User;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;


public class TestUserService extends AbstractTest{
	@Autowired
	private UserService userService;


	@Test
	@Rollback
	public void test(){
		User u=new  User();
		u.setUserName("helloworld");
		u.setPassword(MD5Util.getStringMD5("123456"));
		u.setUserId(UUIDGenerator.getUUID32());
		u.setAge(18);
		userService.save(u);
		System.out.println(JSON.toJSON(u));
		Assert.assertNotNull(userService.selectById(u.getId()));
		List<User> list = userService.selectList(u);
		System.out.println(JSON.toJSONString(list));

		Assert.assertEquals(1,userService.count());
		userService.deleteById(u.getId());

	}

	@Test
	@Rollback
	public void testSelectList(){
		User u=new  User();
		u.setUserName("helloworld");
		u.setPassword("E10ADC3949BA59ABBE56E057F20F883E");
		u.setUserId("3d3834c0ec5c47689925655d75fdd42a");
		u.setAge(18);
		List<User> list = userService.selectList(u);
		System.out.println(JSON.toJSONString(list));
	}

//	@Test
//	public void testInsertMore(){
//	    DecimalFormat df1 = new DecimalFormat("00");
//        User u = new User();
//        for (int i = 0; i < 50; i++) {
//            int dfString = Integer.parseInt(df1.format(i));
//            u.setUserName("yehao"+dfString);
//            u.setAge((10+dfString));
//            u.setPassword("123456"+dfString);
//            userService.insert(u);
//            System.out.println(df1.format(i)+"----"+(10+dfString));
//        }
//    }

	
}