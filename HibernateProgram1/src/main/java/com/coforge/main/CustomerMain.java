package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {

		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		Customer customer=new Customer();

		customer.setCustomerId(676776767);
		customer.setCustomerName("suresh kumar");
		customer.setCustomerSalary(35000.00f);
		

		transaction.begin();
		session.save(customer);
		transaction.commit();
		
	}
}
