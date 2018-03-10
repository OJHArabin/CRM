package fr.rabin.service;

import java.util.List;

import fr.rabin.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);
}
