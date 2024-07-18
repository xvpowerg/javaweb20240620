package tw.com.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tw.com.beans.Item;

import java.util.ArrayList;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Item> list = new ArrayList<>();
		Item i1 = new Item(1,"Item1");
		Item i2 = new Item(2,"Item2");
		Item i3 = new Item(3,"Item3");
		Item i4 = new Item(4,"Item4");
		Item i5 = new Item(5,"Item5");
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		HttpSession session =  req.getSession();
		session.setAttribute("itemList", list);
		
		
		req.getRequestDispatcher("page1.jsp").forward(req, resp);
	}
}
