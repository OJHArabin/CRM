package fr.rabin.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rabin.dao.CustomerDAO;
import fr.rabin.entity.Customer;
import fr.rabin.service.CustomerService;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	
	@Transactional
	public List<Customer> getCustomers() {

		return customerDAO.getCustomers();
	}

    @Transactional
	public void saveCustomer(Customer theCustomer) {
		 
		customerDAO.saveCustomer(theCustomer);
    	
	}

    @Transactional
	public Customer getCustomer(int theId) {

		return customerDAO.getCustomer(theId);
	}

    @Transactional
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);
		
	}

    
    @Transactional
	public List<Customer> searchCustomer(String theSearchName) {
		
		return customerDAO.searchCustomer(theSearchName);
	}
    
    
    


}
