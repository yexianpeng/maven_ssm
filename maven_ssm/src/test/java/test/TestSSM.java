package test;

import java.util.List;

import model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring-mybatis.xml")
public class TestSSM {
	@Autowired
	UserService userService;
	@Test
	public void test() {
		List<User> list = userService.getUsers();
		for (User user : list) {
			System.out.println(user);
		}
	}

}
