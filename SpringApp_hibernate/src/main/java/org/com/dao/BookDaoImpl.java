package org.com.dao;

import java.util.List;

import org.com.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class BookDaoImpl implements BookDao {

	SessionFactory factory;
	Transaction transaction;
	Session session;

	public BookDaoImpl(SessionFactory factory) {
		this.factory = factory;
		session = factory.openSession();
	}

	@Override
	public Book addBook(Book b) {

		transaction.begin();
		session.save(b);
		transaction.commit();
		return b;
	}

	@Override
	public Book removeBook(long isbn) {
		transaction.begin();
		Book b = session.find(Book.class, isbn);
		session.remove(isbn);
		transaction.commit();
		return b;
	}

	@Override
	public Book updateBook(Book b) {
		transaction.begin();
		Book b1 = (Book) session.merge(b);
		transaction.commit();
		return b1;
	}

	@Override
	public Book searchBook(long isbn) {
		return session.find(Book.class, isbn);
	}

	@Override
	public List<Book> getAllBook() {
		return session.createQuery("from Book").getResultList();
	}

}
