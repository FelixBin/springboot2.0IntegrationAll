package top.wfaceboss.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	 @Scheduled(fixedRate = 1000)
	    // @Scheduled(cron = "0 23-25 18 * * ?")
	    public void testSchedule() {
		 System.out.println("现在时间：" + dateFormat.format(new Date()));//现在时间：16:08:31
		
	    }
}
