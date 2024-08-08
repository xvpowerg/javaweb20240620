package tw.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTools {
	private static String url;
	private static String account;
	private static String  password;
	
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url,account,password);
		return conn;
	}
	
	
	public static String getUrl() {
		return url;
	}
	public static void setUrl(String url) {
		DbTools.url = url;
	}
	public static String getAccount() {
		return account;
	}
	public static void setAccount(String account) {
		DbTools.account = account;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		DbTools.password = password;
	}
	
	
}
