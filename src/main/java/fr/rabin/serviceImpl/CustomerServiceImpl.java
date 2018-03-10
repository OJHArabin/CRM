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
	public List<Customer> getCustomer() {

		return customerDAO.getCustomer();
	}

    @Transactional
	public void saveCustomer(Customer theCustomer) {
		 
		customerDAO.saveCustomer(theCustomer);
    	
	}

}
