package tw.com.ejb;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import tw.com.jpa.MyUser;
@Stateless
public class MyUserBean implements MyUserBeanLocal {
	@Inject
	private EntityManager em;
	@Override
	public boolean login(MyUser myUser) {
		// TODO Auto-generated method stub		
		return findUserByAccount(myUser.getAccount(),
				myUser.getPassword())  != null;
	}

	@Override
	public boolean regisrter(MyUser myUser) {
		// TODO Auto-generated method stub
		
		try {
			em.persist(myUser);	
			return true;
		}catch(Exception ex) {
			System.out.println("regisrter Error:"+ex);
		}		
		
		return false;
	}

	@Override
	public MyUser findUserByAccount(String account, String password) {
		// TODO Auto-generated method stub
		 TypedQuery<MyUser> query = em.createNamedQuery("findMyUser", MyUser.class);
		 query.setParameter("account", account);
		 query.setParameter("password", password);
		 try {
			MyUser myUser =   query.getSingleResult(); 
			return myUser;
		 }catch(Exception ex) {
			 System.out.println("findUserByAccount:"+ex);
			return null; 
		 }
				
	}

	@Override
	public boolean deleteUser(MyUser myuser) {
		// TODO Auto-generated method stub
		try {
			
			MyUser myUser = em.merge(myuser);
			em.remove(myUser);
			return true;
		}catch(Exception ex) {
		
			System.out.println("deteteUser:"+ex);
			return false;
			
		}
		
		
	}

	@Override
	public boolean updateUser(MyUser myuser) {
		// TODO Auto-generated method stub
		try {
			em.merge(myuser);
			return true;
		}catch(Exception ex) {
			System.out.println("UpdateUser: "+ex);
			return false;
		}
		
	}
		
}
