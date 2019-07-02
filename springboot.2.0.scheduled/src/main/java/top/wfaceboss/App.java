package top.wfaceboss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * 启动类
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableScheduling // 开启定时任务
public class App 
{
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
}
