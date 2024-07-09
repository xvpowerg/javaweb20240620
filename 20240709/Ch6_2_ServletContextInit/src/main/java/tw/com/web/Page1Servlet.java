package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

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
		String acc = 
				this.getServletContext().getInitParameter("db_acc");
		String pwd = 
				this.getServletContext().getInitParameter("db_pwd");
		//String pwd = "123456";
		//String acc = "qwer";
		PrintWriter out = resp.getWriter();
		out.print(acc+":"+pwd);
	}
}
