package tw.com.web;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyServletContextAttrListener  implements ServletContextAttributeListener{
		@Override
		public void attributeAdded(ServletContextAttributeEvent event) {
			// TODO Auto-generated method stub
			String name = event.getName();
			String value = event.getValue().toString();
			System.out.println("Add:"+name+":"+value);
		}
		
		@Override
		public void attributeReplaced(ServletContextAttributeEvent event) {
			String name = event.getName();
			 String value =   event.getValue().toString();
			 System.out.println("Replaced:"+name+":"+value);
			 ServletContext app =event.getServletContext();
			 String newValue = app.getAttribute(name).toString();
			 System.out.println("Replaced newValue:"+name+":"+newValue);
		}
		
		@Override
		public void attributeRemoved(ServletContextAttributeEvent event) {
			String name = event.getName();
			 String value =   event.getValue().toString();
			 System.out.println("Removed:"+name+":"+value);
		}
}
