package fr.rabin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.rabin.dao.CustomerDAO;
import fr.rabin.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomer(Model theModel) {
		
	List<Customer> theCustomer= customerDAO.getCustomer();
	
	theModel.addAttribute("customers", theCustomer);
		
		return "list-customer";
	}
	
	
}
