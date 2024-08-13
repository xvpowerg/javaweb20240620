package tw.com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlUser implements UserDao{

	@Override
	public boolean login(String account, String password) {
		System.out.println("MySqlUser login");
		String sql = "SELECT * FROM user_info WHERE account = ? and password = ?";
		try(Connection conn =  DbTools.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);){
			stm.setString(1, account);
			stm.setString(2, password);
			
			ResultSet result =  stm.executeQuery();
			return result.next();
		} catch (SQLException e) {
			System.out.println("Login Error:"+e);
			return false;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean regisrter(String account, String password) {
		System.out.println("MySqlUser regisrter");
		String sql = "INSERT INTO user_info(account,password) VALUES(?,?)";
		try(Connection conn =   DbTools.getConnection();
			PreparedStatement stm =	conn.prepareStatement(sql)){
			stm.setString(1, account);
			stm.setString(2, password);
			int count = stm.executeUpdate();
			return count > 0;
		}catch(SQLException ex) {
			System.out.println("regisrter:"+ex);
			return false;
		}
		// TODO Auto-generated method stub
		
	}

}
