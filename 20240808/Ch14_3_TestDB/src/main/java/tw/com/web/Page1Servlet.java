package tw.com.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.com.db.DbTools;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String url = "jdbc:mysql://localhost:3306/testdb20240808?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
//		String user = "root";
//		String password = "123456";
//		
//		try( Connection conn =  DriverManager.getConnection(url,user,password);
//				Statement stem =   conn.createStatement();){
//			stem.executeUpdate("INSERT INTO user_info(account,password)VALUES('ken','123456')");
//		}catch(SQLException ex) {
//			System.out.println("SQLException:"+ex);
//		}
		System.out.println(DbTools.getUrl());
	}
}
