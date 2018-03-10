package fr.rabin.daoImpl;

import java.util.List;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.rabin.dao.CustomerDAO;
import fr.rabin.entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Customer> getCustomer() {

		Session currentSession=sessionFactory.getCurrentSession();
		
		
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
		
		
		List<Customer> customer=theQuery.getResultList();
		
		
		
		return customer;
	}

}
