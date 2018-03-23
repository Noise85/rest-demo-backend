package ch.adesso.edms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="BOOK")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_BOOK")
	@SequenceGenerator(name="SEQ_BOOK", sequenceName="SEQ_BOOK")
	private Integer id;
	private String title;
	@Temporal(value = TemporalType.DATE)
	private Date publicationDate;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="AUTH_BOOKS",
				joinColumns=@JoinColumn(name="BOOK_ID"),
				inverseJoinColumns=@JoinColumn(name="AUTH_ID"))
	private List<Author> authors;
	@ManyToOne
	@JoinColumn(name="publisher_id")
	private Publisher publisher;
	private String isbn;
	private String description;
	@Lob
	private Byte[] sample;
	
	public Book(String title, Date publicationDate, String isbn, String description, Byte[] sample) {
		this.title = title;
		this.authors=new ArrayList<>();
		this.publicationDate = publicationDate;
		this.isbn = isbn;
		this.description = description;
		this.sample = sample;
	}
	
	public Book() {
		this(null,null,null,null,null);
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Byte[] getSample() {
		return sample;
	}
	public void setSample(Byte[] sample) {
		this.sample = sample;
	}
	
		
	
}
