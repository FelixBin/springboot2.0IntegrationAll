package top.wfaceboss.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class User {
	private String name;
	private int age;

	public static void main(String[] args) {
		User user = new User();
		user.setName("wfaceboss");// 此时通过对象.即可点出相关set get方法
		
		log.info("使用lombok提供的日志");
	}
}
