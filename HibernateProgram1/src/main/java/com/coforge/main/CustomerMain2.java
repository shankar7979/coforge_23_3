package com.coforge.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.coforge.dao.CustomerDao;
import com.coforge.dao.CustomerDaoImpl;
import com.coforge.model.Customer;

public class CustomerMain2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		CustomerDao dao = new CustomerDaoImpl();
		Customer customer;

		String ch = "y", dob;

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		while (ch.equals("y")) {
			System.out.println("1.Add Customer");
			System.out.println("2.Search Customer");
			System.out.println("3.List Of All Customer");
			int key = scanner.nextInt();

			switch (key) {
			case 1:
				customer = null;
				customer = new Customer();
				System.out.println("Enter name salary and dob in dd-MM-yyyy format ");
				customer.setCustomerName(scanner.nextLine());
				customer.setCustomerSalary(scanner.nextFloat());
				dob = scanner.next();
				LocalDate dob1 = LocalDate.parse(dob, dateTimeFormatter);
				customer.setCustomerDob(dob1);

				Customer addCustomer = dao.addCustomer(customer);
				if(addCustomer!=null) {
					System.out.println("customer added");
				}
				else 
					System.out.println("customer id already present");
				break;

			default:
				break;
			}
		}
		scanner.close();
	}
}
