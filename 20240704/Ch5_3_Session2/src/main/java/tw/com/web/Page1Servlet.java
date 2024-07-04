package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int count = 0;
		HttpSession session =  req.getSession();
		if (session.getAttribute("count") != null) {
			count = (Integer)session.getAttribute("count");
		}
		count++;
		session.setAttribute("count", count);
		
	 	PrintWriter out =  resp.getWriter();
	 	out.print("<html>");
	 	out.print("<body>");
	 	out.print("<H2>Count:");
	 	out.print(count);
	 	out.print("</H2>");
	 	out.print("<a href='page2'>Page2</a>");
		out.print("</body>");
		out.print("</html>");
		
	}
}
