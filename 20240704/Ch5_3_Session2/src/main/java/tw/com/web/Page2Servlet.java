package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =  req.getSession();
		int count = (Integer) session.getAttribute("count");
		count++;
		session.setAttribute("count", count);
		
		
		PrintWriter out =  resp.getWriter();
	 	out.print("<html>");
	 	out.print("<body>");
	 	out.print("<H2>Count:");
	 	out.print(count);
	 	out.print("</H2>");
	 	out.print("<a href='page1'>Page1</a>");
		out.print("</body>");
		out.print("</html>");
	}
}
