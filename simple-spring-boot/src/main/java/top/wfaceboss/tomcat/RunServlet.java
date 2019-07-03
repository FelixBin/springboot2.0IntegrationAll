package top.wfaceboss.tomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.startup.Tomcat.FixContextListener;

/**
 * 使用java语言创建Tomcat服务器 ，Tomcat底层执行servlet程序<br>
 * SpringMVC底层使用servlet包装<br>
 * 
 * @author wfaceboss
 *
 */
public class RunServlet {

	// 端口号
	private static int PORT = 8088;

	// 项目名称
	private static String CONTEXT_PATH = "/wfaceboss"; //上下文路径

	private static String SERVLET_NAME = "servet";//servlet name

	public static void main(String[] args) throws LifecycleException {

		// 创建tomcat服务器
		Tomcat tomcatServer = new Tomcat();

		// 设置tomcat端口号
		tomcatServer.setPort(PORT);

		// 是否设置自动部署
		tomcatServer.getHost().setAutoDeploy(false);

		// 创建Context上下文
		StandardContext standardContext = new StandardContext();

		// 设置上下文路径
		standardContext.setPath(CONTEXT_PATH);

		// 监听上下文
		standardContext.addLifecycleListener(new FixContextListener());

		// tomcat容器添加standardContext
		tomcatServer.getHost().addChild(standardContext);

		// 创建servlet
		tomcatServer.addServlet(CONTEXT_PATH, SERVLET_NAME, new Servet());

		// 添加servlet url映射
		standardContext.addServletMappingDecoded("/index", SERVLET_NAME);  //SERVLET_NAME/index
		
		//启动
		tomcatServer.start();
		
		System.out.println("tomcat running success....");

		// 异步接收请求
		tomcatServer.getServer().await();

	}
}
