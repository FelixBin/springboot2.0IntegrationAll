package top.wfaceboss.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	private static final Logger logger = LoggerFactory.getLogger(indexController.class);

	@GetMapping("/index")
	public String index() {
		logger.info("springboot2.0集成log4j成功");
		return "index";
	}
}
