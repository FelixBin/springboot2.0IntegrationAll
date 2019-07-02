package top.wfaceboss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类<br>
 * @author Administrator
 *@SpringBootApplication=@EnableAutoConfiguration+@ComponentScan
 */
@SpringBootApplication
public class App {
	public static void main( String[] args )
    {
		// 程序入口，启动SpringBoot项目 项目创建内置tomcat服务器 使用tomcat加载springmvc 注解启动类
       SpringApplication.run(App.class,args);
    }
}
