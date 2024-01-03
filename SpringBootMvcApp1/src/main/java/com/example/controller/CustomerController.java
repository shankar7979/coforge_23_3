package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Customer;

@Controller
@RequestMapping("/cst")
public class CustomerController {

	@GetMapping("/cstform")
	public String customerForm() {
		return "CustomerForm";
	}

	@PostMapping("/cstform")
	public String customerResult(@RequestParam("id") long id,
			@RequestParam("name") String name,
			@RequestParam("salary") float salary, ModelMap map) {

		Customer customer=new Customer();
		customer.setCustomerId(id);
		customer.setCustomerName(name);
		customer.setCustomerSalary(salary);
		map.addAttribute("customer", customer);
		return "CustomerResult";
	}

}
