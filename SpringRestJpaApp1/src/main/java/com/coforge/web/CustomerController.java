package com.coforge.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.model.Customer;
import com.coforge.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;

	@GetMapping("/all")
	public List<Customer> getAllCustomer() {
		return service.getAllCustomer();
	}

	@GetMapping("/search/{id}")
	public Customer searchCustomer(@PathVariable("id") long id) {
		return service.searchCustomer(id);
	}
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@DeleteMapping("/remove/{id}")
	public Customer removeCustomer(@PathVariable("id") long id) {
		return service.removeCustomer(id);
	}

	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
}
