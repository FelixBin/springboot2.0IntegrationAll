package top.wfaceboss.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.wfaceboss.dao.UserDao;
import top.wfaceboss.entity.UserEntity;

@RestController
public class IndexController {
	@Autowired
	private UserDao userDao;

	@RequestMapping("/jpaFindUser")
	public Object jpaIndex() {
		Optional<UserEntity> userOptional = userDao.findById(1);
		UserEntity reusltUser = userOptional.get();

		return reusltUser == null ? "没有查询到数据" : reusltUser;

	}
}
