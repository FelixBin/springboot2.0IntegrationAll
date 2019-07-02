package top.wfaceboss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.wfaceboss.service.UserServiceImp;

@RestController
public class IndexController {
	@Autowired
	private UserServiceImp userServiceImp;
   //http://localhost:8080/createUser?name=wfaceboss&age=22
	@RequestMapping("/createUser")
	public String createUser(String name, Integer age) {

		userServiceImp.createUser(name, age);//调用方法
		return "createUser Succeed";
	}
}
