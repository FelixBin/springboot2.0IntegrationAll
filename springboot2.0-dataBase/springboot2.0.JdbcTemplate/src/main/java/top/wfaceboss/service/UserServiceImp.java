package top.wfaceboss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * userSer接口实现
 * @author Administrator
 *
 */
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void createUser(String name, Integer age) {
		jdbcTemplate.update("insert into user values(null,?,?);", name, age);
	}
}
