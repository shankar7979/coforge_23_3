package org.com.main;

import org.com.cofig.ApplicationConfig;
import org.com.dao.BookDaoImpl;
import org.com.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		BookDaoImpl dao = context.getBean(BookDaoImpl.class);
	
		System.out.println("add record");
		
		Book book=new Book();
		book
	
	}
}
