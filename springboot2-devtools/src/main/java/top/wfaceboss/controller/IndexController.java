package top.wfaceboss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在做热部署测试的时候，不要改当前方法测试，可能会没有效果
 * 专业测试方法：对class文件新增方法后保存然后会发现控制台会重新自动启动    （该种方法测试会比较明显）
 * @author Administrator
 *
 */
@RestController
public class IndexController {
	@RequestMapping("/indexDev")
	public String indexDev() {
		return "测试 1";
	}
}
