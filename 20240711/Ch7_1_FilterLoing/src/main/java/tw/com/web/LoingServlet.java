package tw.com.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoingServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String acc = req.getParameter("acc");
		String pwd = req.getParameter("pwd");
		HttpSession session =  req.getSession();
	
		if (acc.equals("qwer") && 
				pwd.equals("123456")) {
			session.setAttribute("login", true);
			resp.sendRedirect("p1/p1_1.html");
		}else {
			resp.sendRedirect("p2/login.html");
		}
	}
}
