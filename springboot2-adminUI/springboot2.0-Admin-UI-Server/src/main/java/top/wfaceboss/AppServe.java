package top.wfaceboss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class AppServe {

	public static void main(String[] args) {
		// 程序入口，启动SpringBoot项目 项目创建内置tomcat服务器 使用tomcat加载springmvc 注解启动类
		SpringApplication.run(AppServe.class, args);
	}
}
