/*package ch.adesso.edms.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ch.adesso.edms.model.Book;
import ch.adesso.edms.service.BookService;

@RestController
@RequestMapping("/books")
public class BookControllerImpl implements BookController {

	@Autowired
	BookService service;
	
	@Override
	@RequestMapping(path="/", produces=MediaType.APPLICATION_JSON_UTF8_VALUE, method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<Iterable<Book>> list(PersistentEntityResourceAssembler assembler) {
		ResponseEntity<Iterable<Book>> response = new ResponseEntity<Iterable<Book>>(service.getAllBooks(), HttpStatus.OK);
		return response;
	}

	@Override
	@RequestMapping(path="/{id}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE, method=RequestMethod.GET)
	public ResponseEntity<PersistentEntityResource> get(@PathVariable("id") Integer id, PersistentEntityResourceAssembler assembler) {
		return ResponseEntity.ok(assembler.toResource(service.getBook(id)));
	}

	@Override
	@RequestMapping(path="/", produces=MediaType.APPLICATION_JSON_UTF8_VALUE, method=RequestMethod.PUT)
	public ResponseEntity<?> add(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(path="/", produces=MediaType.APPLICATION_JSON_UTF8_VALUE, method=RequestMethod.POST)
	public ResponseEntity<?> save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(path="/", produces=MediaType.APPLICATION_JSON_UTF8_VALUE, method=RequestMethod.DELETE)
	public void delete(Integer id) {
		// TODO Auto-generated method stub
	}
	
}
*/