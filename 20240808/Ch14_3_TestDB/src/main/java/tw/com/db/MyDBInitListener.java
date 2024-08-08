package tw.com.db;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyDBInitListener implements ServletContextListener {
		@Override
		public void contextInitialized(ServletContextEvent sce) {
			// TODO Auto-generated method stub
		ServletContext context = sce.getServletContext();
		 String  db_url =  context.getInitParameter("db_url");
		 String account = context.getInitParameter("db_account");
		 String password = context.getInitParameter("db_password");
		 DbTools.setUrl(db_url);
		 DbTools.setAccount(account);
		 DbTools.setPassword(password);
		 
		}
}
