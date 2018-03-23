package ch.adesso.edms.service;

import java.util.Optional;

import ch.adesso.edms.model.Book;

public interface BookService {
	
	public Iterable<Book> getAllBooks();
	public Optional<Book> getBook(Integer id);
	public void deleteBook(Integer id);
	public Book save(Book book);
	
}
