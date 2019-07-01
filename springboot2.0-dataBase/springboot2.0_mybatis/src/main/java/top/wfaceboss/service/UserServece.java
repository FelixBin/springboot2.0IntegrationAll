package top.wfaceboss.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import top.wfaceboss.entity.User;
import top.wfaceboss.mapper.UserMapper;

@Service
@Slf4j
public class UserServece {
	@Autowired
	private UserMapper userMapper;

	public int insertUser(String name, Integer age) {
		int res = userMapper.insert(name, age);
		log.info("============res=:{}==================>", res);
		return res;
	}

	public List<User> findByName(String name) {
		List<User> res=userMapper.findByName(name);
		log.info("============res=:{}==================>", res);
		return  res;
	}
}
