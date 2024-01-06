package ogr.coforge.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ogr.coforge.model.Book;
import ogr.coforge.repository.BookDao;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookDao dao;
	
	@PostMapping("/add")
	public Book addBook(Book b) {
	  return dao.save(b);
	}
	
	@GetMapping("/all")
	public List<Book> geAllBook() {
		 return dao.findAll();
	}
	
}
