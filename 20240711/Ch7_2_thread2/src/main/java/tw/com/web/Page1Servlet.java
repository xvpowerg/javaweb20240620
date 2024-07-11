package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
	private ExecutorService es;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		es = Executors.newCachedThreadPool();
	}
	private void test( HttpServletResponse resp) throws IOException {
		
		for (int i =1;i<=10;i++) {
			System.out.println("工作中...."+i+":"+
				Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(1);
		
			}catch(Exception ex) {
				
			}
			
		}
		resp.getWriter().println("TestPage1XXXX");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		
		es.execute(()->{
			try {
				test(resp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		out.println("Page1");
		System.out.println("Page1.....:"+
		Thread.currentThread().getName());
	}
}
