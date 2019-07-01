package top.wfaceboss.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FTLIndexController {
 
	@RequestMapping("/ftlIndex")
	public String ftlIndex(Map<String,Object> map) {
		map.put("name", "wfaceboss");
		return "fltIndex";
	}
}
