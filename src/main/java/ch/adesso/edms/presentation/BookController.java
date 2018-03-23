package ch.adesso.edms.presentation;

import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.http.ResponseEntity;

import ch.adesso.edms.model.Book;

public interface BookController {

	/**
	 * Gets a list of Books in JSON format
	 * @return
	 */
	public ResponseEntity<Iterable<Book>> list(PersistentEntityResourceAssembler assembler);
	
	/**
	 * Gets a Book in JSON format
	 */
	public ResponseEntity<PersistentEntityResource> get(Integer id, PersistentEntityResourceAssembler assembler);
	
	/**
	 * Add a new book and persist his children
	 */
	public ResponseEntity<?> add(Book book);
	
	/**
	 * Updates the relationship between books and authors
	 */
	public ResponseEntity<?> save(Book book);
	
	/**
	 * Deletes an existing book
	 */
	public void delete(Integer id);
	
}
