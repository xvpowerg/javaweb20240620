package tw.com.web;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    ServletContext app = this.getServletContext();
		    app.setAttribute("value1", "Test1");
		    app.setAttribute("value2", 12345);
		    app.setAttribute("value3", "ABCD");
		    app.setAttribute("value4", "RTYU");
		    
		    app.removeAttribute("value3");
		    app.setAttribute("value4", "UI00");
		    resp.getWriter().println("Page1");
		    
		    
	}
}
