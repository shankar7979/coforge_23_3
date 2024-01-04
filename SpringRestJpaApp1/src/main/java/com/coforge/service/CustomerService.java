package com.coforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.CustomerDao;
import com.coforge.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao dao;
	
	public Customer addCustomer(Customer c) {
    	return	dao.save(c);
	}
	
	public Customer updateCustomer(Customer c) {
		return	dao.save(c);
	}
	public Customer removeCustomer(long id) {
			Optional<Customer> findById = dao.findById(id);
			
	         if(findById.isPresent()) {
	        	 Customer customer=findById.get();
	        	 dao.delete(customer); 
	          return customer;
	         }
	         return null;
	}
	
	public Customer searchCustomer(long id ) {
		Optional<Customer> findById = dao.findById(id);
		if(findById.isPresent())
			return findById.get();
		
		return null;
	}
	public List<Customer> getAllCustomer() {
		 return dao.findAll();
	}
	
}
