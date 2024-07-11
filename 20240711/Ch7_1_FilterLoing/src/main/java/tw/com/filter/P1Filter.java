package tw.com.filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter("/p1/*")
public class P1Filter extends HttpFilter  {
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		 HttpSession session =  request.getSession();
		Object login =  session.getAttribute("login");
		if (login == null) {
			String toPage = "../p2/login.html";
			response.sendRedirect(toPage);
			return;
		}
		chain.doFilter(request, response);
	}
}
