package com.coforge.main.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.coforge.model.one_to_one.Address;
import com.coforge.model.one_to_one.Employee;
import com.coforge.util.SessionFactoryUtil;

public class One_To_One_Main {

	public static void main(String[] args) {

		SessionFactory factory=SessionFactoryUtil.getSessionFactory();
		Session session=factory.openSession();
		
		Employee employee=new Employee();
		Address address=new Address();

		employee.setName("arvind kumar");
		employee.setSalary(35000);
		
		address.setAddr_City("greater noida");
		address.setAddr_State("Uttar Pardesh");
		address.setPin(67676767);

		employee.setAddress(address);
		
		session.getTransaction().begin();
        
		session.save(address);
		session.save(employee);
		session.getTransaction().commit();
		
	}
}
