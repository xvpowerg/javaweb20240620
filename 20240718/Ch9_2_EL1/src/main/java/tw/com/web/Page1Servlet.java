package tw.com.web;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tw.com.beans.Item;
import tw.com.beans.User;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) 
					throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	Item item1 = new Item("Item1",100);
	req.setAttribute("item1", item1);
	
	HttpSession session = req.getSession();
	ArrayList<User> list = new ArrayList<>();
	list.add(new User("User1",21));
	list.add(new User("User2",18));
	list.add(new User("User3",16));
	list.add(new User("User4",25));
	
	session.setAttribute("userList", list);
	
	Map<String,User> userMap = new HashMap<>();
	userMap.put("user1", new User("user1",17));
	userMap.put("my user2", new User("user2",25));
	
	ServletContext app = this.getServletContext();
	app.setAttribute("userMap", userMap);
	
	req.getRequestDispatcher("page1.jsp").forward(req, resp);
	
	
	
	
	
	}
}
