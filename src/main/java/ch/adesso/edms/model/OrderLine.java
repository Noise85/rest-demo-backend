package ch.adesso.edms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_LINE")
public class OrderLine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ORDER_LINE")
	@SequenceGenerator(name="SEQ_ORDER_LINE", sequenceName="SEQ_ORDER_LINE")
	private Integer id;
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;
	private Integer quantity;
	
	public OrderLine(Book book, Integer quantity) {
		this.book = book;
		this.quantity = quantity;
	}

	public OrderLine() {
		this(null,null);
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
