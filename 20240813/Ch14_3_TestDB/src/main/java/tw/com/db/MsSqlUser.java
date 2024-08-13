package tw.com.db;

public class MsSqlUser implements UserDao {

	@Override
	public boolean login(String account, String password) {
		// TODO Auto-generated method stub
			System.out.println("MsSqlUser login");
		return true;
	}

	@Override
	public boolean regisrter(String account, String password) {
		// TODO Auto-generated method stub
		System.out.println("MsSqlUser regisrter");
		return true;
	}

}
