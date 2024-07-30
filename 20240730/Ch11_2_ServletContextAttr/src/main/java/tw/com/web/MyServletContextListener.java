package tw.com.web;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener  {
		@Override
		public void contextInitialized(ServletContextEvent sce) {
			// TODO Auto-generated method stub
			System.out.println("contextInitialized Initialized db ...");
		}
		@Override
		public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
			System.out.println("contextDestroyed Close db ...");
		}
}
