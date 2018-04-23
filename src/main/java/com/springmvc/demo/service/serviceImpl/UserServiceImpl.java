package com.springmvc.demo.service.serviceImpl;

import com.springmvc.demo.mapper.UserMapper;
import com.springmvc.demo.model.User;
import com.springmvc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int delete(Integer id) {
		if (null!=id){
			return userMapper.delete(id);
		}
		return 0;
	}

	@Override
	public int insert(User user) {
		if (null!=user){
			user.setCreateTime(new Date());
			user.setUpdateTime(new Date());
			return userMapper.insert(user);
		}
		return 0;
	}

	@Override
	public int update(User user) {
		if(user != null){
			user.setUpdateTime(new Date());
			return userMapper.update(user);
		}
		return 0;
	}

	@Override
	public int save(User user) {
		int flag = 0;
		if (user.getId()!=null){
			//this user exist
			user.setUpdateTime(new Date());
			flag = userMapper.update(user);
		}else {
			user.setCreateTime(new Date());
			user.setUpdateTime(new Date());
			flag = userMapper.insertSelective(user);
		}
		return flag;
	}

	@Override
	public User selectById(Integer id) {
		User user = null;
		if(null!=id){
			user = userMapper.selectById(id);
		}
		return user;
	}

	@Override
	public List<User> selectList(User user) {
		List<User> users = new ArrayList<>();
		if(user!=null){
			users = userMapper.selectByEntity(user);
		}
		return users;
	}

	@Override
	public int count() {
		return userMapper.count();
	}
}
