package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	Configuration configuration;
	SessionFactory factory;
	Session session;
	Transaction transaction;

	public CustomerDaoImpl() {
		configuration = new Configuration().configure();
		factory = configuration.buildSessionFactory();
		session = factory.openSession();
		transaction = session.getTransaction();
	}

	public Customer addCustomer(Customer c) {
		Customer c1 = searchCustomer(c.getCustomerId());
		if (c1 == null) {
			transaction.begin();
			session.save(c);
			transaction.commit();
			return c;
		}
		return null;
	}

	public Customer searchCustomer(int id) {
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	public List<Customer> getAllCustomer() {
		return session.createQuery("from Customer").getResultList();
	}

}
