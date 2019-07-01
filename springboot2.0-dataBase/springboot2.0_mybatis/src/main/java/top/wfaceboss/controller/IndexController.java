package top.wfaceboss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/Index")
	public String Index() {
		return "index";
	}
}
