package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashMap;

@WebServlet("/order2")
public class OrderServlet2 extends HttpServlet{
	private HashMap<String,String> orderMap = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		orderMap.put("20","雞腿飯");
		orderMap.put("35","排骨飯");
		orderMap.put("12","魚排飯");
	}
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
		  out.print("i:"+orderMap.get(i)+"<br>");
	  }
	}
}
