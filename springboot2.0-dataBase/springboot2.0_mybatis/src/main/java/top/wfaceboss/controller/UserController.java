package top.wfaceboss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import top.wfaceboss.entity.User;
import top.wfaceboss.service.UserServece;

@RestController
@Slf4j
public class UserController {
	@Autowired
	private UserServece userService;

	@RequestMapping("/insertUser")
	public Integer insertUser(String name, Integer age) {
		return userService.insertUser(name, age);
	}

	@RequestMapping("/findByName")
	public List<User> findByName(String name) {
		List<User> res = userService.findByName(name);
		return res;
	}
}
