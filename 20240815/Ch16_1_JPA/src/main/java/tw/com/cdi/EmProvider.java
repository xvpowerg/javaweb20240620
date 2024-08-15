package tw.com.cdi;

import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class EmProvider {
	
	@PersistenceContext
	@Produces
	private EntityManager em;
}
