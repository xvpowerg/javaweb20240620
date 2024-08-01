package tw.com.web;

import java.io.IOException;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.com.tools.MaskNetTools;

@WebServlet(urlPatterns = "/page1",asyncSupported = true)
public class MaskServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("MaskServlet:"+Thread.currentThread().getName());
		AsyncContext contxt =  req.startAsync();
		MaskNetTools.downloadMaskJson(list->{
				System.out.println("downloadMaskJson:"+Thread.currentThread().getName());
					
				try {
					ServletRequest newReq =   contxt.getRequest();
					ServletResponse newResp =  contxt.getResponse();
					newReq.setAttribute("maskList", list);
					newReq.getRequestDispatcher("mask.jsp").forward(newReq, newResp);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					contxt.complete();
				}
			System.out.println(list);
			
		});
	}
}
