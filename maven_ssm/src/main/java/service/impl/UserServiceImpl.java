package service.impl;

import java.util.ArrayList;
import java.util.List;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserMapper;
import service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public List<User> getUsers() {
	
		List<User> list = userMapper.findAll();
		return list;
	}

}
