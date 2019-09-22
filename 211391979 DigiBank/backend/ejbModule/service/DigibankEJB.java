package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.DigibankEntity;

/**
 * Session Bean implementation class DigibankEJB
 */
@Stateless
@LocalBean
public class DigibankEJB {


	@PersistenceContext
	private EntityManager em;
	
    public DigibankEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(DigibankEntity digibankEntity)
    {
    	System.out.println("============================");
    	System.out.println(digibankEntity.getName());
    	em.persist(digibankEntity);
    	System.out.println("============================");
    }

}
