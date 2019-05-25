package dao;

import java.util.List;

import model.User;

public interface UserMapper {
	public List<User> findAll();
}
