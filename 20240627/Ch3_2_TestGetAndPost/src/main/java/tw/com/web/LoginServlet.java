package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String account = "qwer";
		String pwd = "123456";
		
		String inAcc = req.getParameter("account");
		String inPwd =  req.getParameter("pwd");
		PrintWriter out = 	 resp.getWriter();
		if(inAcc != null && inPwd!= null && 
				inAcc.equals(account) && inPwd.equals(pwd) ) {
			out.println("Loing");
		}else {
			out.println("Fail");
		}
		
	}
}
