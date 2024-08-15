package tw.com.web;

import java.io.IOException;

import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.com.ejb.MyUserBeanLocal;
import tw.com.jpa.MyUser;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@EJB
	private MyUserBeanLocal myUserBaen;  
	//@Inject
	//private EntityManager em;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyUser myUser = new MyUser();
		myUser.setAccount("ken");
		myUser.setPassword("123456");
		myUserBaen.regisrter(myUser);
		
		MyUser myUser2 = myUserBaen.findUserByAccount("ken", "123456");
		System.out.println(myUser2);
		myUser2.setAccount("iris");
		boolean updateUser =  myUserBaen.updateUser(myUser2);
		System.out.println(updateUser);
//		boolean delUser = myUserBaen.deleteUser(myUser2);
//		System.out.println(delUser);
		
	}
}
