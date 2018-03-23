package ch.adesso.edms.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="APP_ORDER")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ORDER")
	@SequenceGenerator(name="SEQ_ORDER", sequenceName="SEQ_ORDER")
	private Integer id;
	private String code;
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="ORDER_ID")
	private List<OrderLine> odrderLines;
	
	public Order(String code, User user) {
		this.code = code;
		this.user = user;
		this.odrderLines = new ArrayList<>();
	}

	public Order() {
		this(null,null);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderLine> getOdrderLines() {
		return odrderLines;
	}

	public void setOdrderLines(List<OrderLine> odrderLines) {
		this.odrderLines = odrderLines;
	}
	
}
