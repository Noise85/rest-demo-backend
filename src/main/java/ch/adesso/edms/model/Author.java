package ch.adesso.edms.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="AUTHOR")
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_AUTH")
	@SequenceGenerator(name="SEQ_AUTH", sequenceName="SEQ_AUTH")
	private Integer id;
	private String name;
	@ManyToMany(mappedBy="authors", fetch=FetchType.LAZY)
	private List<Book> books;
	
	public Author(String name) {
		this.name = name;
		this.books = new ArrayList<>();
	}

	public Author() {
		this(null);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
