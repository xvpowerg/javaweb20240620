package tw.com.web;

import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionBindingListener;

public class MyUser implements HttpSessionBindingListener  {
	private String name;

	public MyUser(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name =  event.getName();
		Object obj = event.getValue();
		System.out.println("valueBound:"+name+":"+obj);
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name =  event.getName();
		Object obj = event.getValue();
		System.out.println("valueUnbound:"+name+":"+obj);
	}
	
}
