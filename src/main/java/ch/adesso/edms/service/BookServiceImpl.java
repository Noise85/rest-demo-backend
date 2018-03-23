package ch.adesso.edms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.adesso.edms.model.Book;
import ch.adesso.edms.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Book> getBook(Integer id) {
		return bookRepository.findById(id);
	}

	@Override
	@Transactional
	public void deleteBook(Integer id) {
		bookRepository.deleteById(id);
	}

	@Override
	@Transactional
	public Book save(Book book) {
		return bookRepository.save(book);
	}

}
