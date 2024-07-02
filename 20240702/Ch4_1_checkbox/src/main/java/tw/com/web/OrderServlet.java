package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/order")
public class OrderServlet extends HttpServlet{
	private String[] orderName = {"雞腿飯","排骨飯","魚排飯"};
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  resp.setContentType("text/html;charset=utf-8");
		
	  PrintWriter out = resp.getWriter();
	  out.println("Order!");
	  //String food = req.getParameter("food");
	  //System.out.println("food:"+food);

	  String[] food = req.getParameterValues("food");
	  if (food == null || food.length == 0) {
		  out.println("Select Order Food");
		  return;
	  }
	  for (String i : food) {
		  int index = Integer.parseInt(i);
		  System.out.println("food:"+orderName[index]);
		  out.print("i:"+i+"<br>");
	  }
	}
}
