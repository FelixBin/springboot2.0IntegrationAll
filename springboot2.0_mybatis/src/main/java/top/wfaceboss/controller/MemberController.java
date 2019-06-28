package  top.wfaceboss.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestControlle====>@Controller +@ResponseBody
//@EnableAutoConfiguration 默认在当前类扫包
@RestController
public class MemberController {

	@RequestMapping("/memberIndex")
	public String memberIndex() {
		return "hello spring boot 2.0";
	}

}
